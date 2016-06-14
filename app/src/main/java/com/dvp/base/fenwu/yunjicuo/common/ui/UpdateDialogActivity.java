package com.dvp.base.fenwu.yunjicuo.common.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonApp;
import com.dvp.base.fenwu.yunjicuo.common.domain.ClientVersion;
import com.dvp.base.fenwu.yunjicuo.common.update.UpdateAgent;

import java.io.File;

import butterknife.Bind;
import butterknife.ButterKnife;

public class UpdateDialogActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    @Bind(R.id.update_ll)
    LinearLayout updateLl;
    @Bind(R.id.update_ok_btn)
    TextView updateOkBtn;
    @Bind(R.id.update_cancel_btn)
    TextView updateCancelBtn;
    @Bind(R.id.update_ignore_btn)
    Button updateIgnoreBtn;
    @Bind(R.id.update_check_cb)
    CheckBox updateCheckCb;
    @Bind(R.id.update_content_tv)
    TextView updateContentTv;
    @Bind(R.id.update_wifi_indicator_iv)
    ImageView updateWifiIndicatorIv;

    private int updateType;
    private ClientVersion cv;
    private boolean isIgnore;
    private boolean isForce;
    private File apkFile;

    public UpdateDialogActivity() {
        updateType = 6;
        isIgnore = false;
        apkFile = null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_dialog);
        ButterKnife.bind(this);
        init();
    }

    @Override
    public void onClick(View v) {
        // 忽略updateCloseBtn、updateCancelBtn
        switch (v.getId()) {
            case R.id.update_ok_btn:
                updateType = 5;
                break;
            case R.id.update_ignore_btn:
                updateType = 7;
                break;
        }
        if (isIgnore) {
            updateType = 7;
        }
        finish();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && isForce) {
            CommonApp.getInstance().exitApp(false);
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        UpdateAgent.updateResult(updateType, UpdateDialogActivity.this, cv,
                apkFile);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        isIgnore = isChecked;
    }

    private void init() {
        cv = (ClientVersion) getIntent().getSerializableExtra("cv");
        String file = getIntent().getStringExtra("file");
        isForce = cv.getIsMandatory().equals("0") ? false : true;
        // boolean isForce = getIntent().getBooleanExtra("force", false);
        boolean fileNotNull = file != null;
        if (fileNotNull) {
            apkFile = new File(file);
        }

        updateOkBtn.setOnClickListener(this);
        updateCancelBtn.setOnClickListener(this);
        updateIgnoreBtn.setOnClickListener(this);

        updateCheckCb.setOnCheckedChangeListener(this);

        updateContentTv.requestFocus();
        updateContentTv.setText(cv.getDescription());

        // 是否wifi
        if (CommonApp.getInstance().getAppConfig().getString("netType", "").equals("wifi")) {
            updateWifiIndicatorIv.setVisibility(View.GONE);
        } else {
            updateWifiIndicatorIv.setVisibility(View.VISIBLE);
        }

        // 是否强制更新
        if (isForce) {
            updateCheckCb.setVisibility(View.GONE);
            updateCancelBtn.setVisibility(View.GONE);
        }

    }
}