package com.dvp.base.fenwu.yunjicuo.ui;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dvp.base.fenwu.yunjicuo.R;
import com.dvp.base.fenwu.yunjicuo.common.CommonActivity;
import com.dvp.base.fenwu.yunjicuo.common.util.DialogUtil;
import com.dvp.base.fenwu.yunjicuo.model.ForgetPswModel;
import com.dvp.base.util.Countdown;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.ImagePipeline;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import me.zhanghai.android.materialedittext.MaterialEditText;
import me.zhanghai.android.materialedittext.MaterialTextInputLayout;

/**
 * 忘记密码界面
 */
public class ForgetPswActivity extends CommonActivity implements Countdown.TextViewGetListener, Countdown.CountdownListener
{

    @Bind(R.id.middleTitle_tv)
    TextView middleTitleTv;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.shoujihao_edittext)
    AppCompatEditText shoujihaoEdittext;
    @Bind(R.id.fasongyanzhengma_md)
    TextView fasongyanzhengmaMd;
    @Bind(R.id.tianxieyanzhengma_edittext)
    MaterialEditText tianxieyanzhengmaEdittext;
    @Bind(R.id.tianxieyanzhengma_layout)
    MaterialTextInputLayout tianxieyanzhengmaLayout;
    @Bind(R.id.queding_btn)
    Button quedingBtn;
    @Bind(R.id.form)
    LinearLayout form;
    @Bind(R.id.picyanzhengma_webview)
    SimpleDraweeView picyanzhengmaWebview;
    @Bind(R.id.pictuxingyanzhengma_edittext)
    MaterialEditText pictuxingyanzhengmaEdittext;
    @Bind(R.id.pictuxingyanzhengma_layout)
    MaterialTextInputLayout pictuxingyanzhengmaLayout;

    private ForgetPswModel mModel;
    private Countdown countdown;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_psw);
        ButterKnife.bind(this);

        init();
    }

    /**
     * 初始化
     */
    private void init()
    {
        setSupportActionBar(toolbar);
        setTitle("");
        middleTitleTv.setText("用户注册");
        toolbar.setNavigationOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });

        if (mModel == null)
        {
            mModel = new ForgetPswModel(this);
        }
        mModel.addResponseListener(this);
        //mModel.createTuXingYanZhengMa(getResources().getString(R.string.forget_psw_getpicviladata_trancode));
        clearFrescoCache();
        picyanzhengmaWebview.setImageURI(Uri.parse(getResources().getString(R.string.http_request_url) + "/system/createvalicode"));

        pictuxingyanzhengmaEdittext.addTextChangedListener(textWatcher);
    }


    private TextWatcher textWatcher = new TextWatcher() {

        @Override
        public void onTextChanged(CharSequence s, int start, int before,
                                  int count) {
//
            System.out.println("-1-onTextChanged-->"
                    + pictuxingyanzhengmaEdittext.getText().toString() + "<--");

        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count,
                                      int after) {
//
            System.out.println("-2-beforeTextChanged-->"
                    + pictuxingyanzhengmaEdittext.getText().toString() + "<--");

        }

        @Override
        public void afterTextChanged(Editable s) {
//
            System.out.println("-3-afterTextChanged-->"
                    + pictuxingyanzhengmaEdittext.getText().toString() + "<--");

            if(s.length()>=4)
            {
                mModel.checkValidata(getResources().getString(R.string.forget_psw_checkviladata_trancode), pictuxingyanzhengmaEdittext.getText().toString());
            }
        }
    };
    @Override
    public void OnHttpResponse(String var1, String var2)
    {
       /* if (var1.equals(getResources().getString(R.string.forget_psw_getpicviladata_trancode)))
        {

        }*/

        if(var1.equals(getResources().getString(R.string.forget_psw_checkviladata_trancode)))//图形验证码是否正确
        {
            if(var2.equals("1"))
            {
                DialogUtil.showToast(getApplicationContext(),"图形验证码输入正确");
            }
            if(var2.equals("0"))
            {
                DialogUtil.showToast(getApplicationContext(),"图形验证码输入错误");
            }
        }

        //验证码是否正确
        if(var1.equals(getResources().getString(R.string.zhuce_yzyanzhengma_trancode)))
        {

            if(mModel.getIsTrueYanzhengma().equals("no"))
            {
                DialogUtil.showToast(getApplicationContext(),"验证码不正确");
                return;
            }
            else if(mModel.getIsTrueYanzhengma().equals("timeout"))
            {
                DialogUtil.showToast(getApplicationContext(),"验证码超时，请重新发送");
                return;
            }
            else if(mModel.getIsTrueYanzhengma().equals("invalid"))
            {
                DialogUtil.showToast(getApplicationContext(),"验证码无效");
                return;
            }
            else
            {
                Bundle bundle =  new Bundle();
                bundle.putString("username",shoujihaoEdittext.getText().toString());
                startActivity(ResetPswActivity.class,bundle);
                //mModel.postSignUp(getResources().getString(R.string.zhuce_submit),username.getText().toString(),password.getText().toString(),querenPassword.getText().toString(),mSchoolId,shoujihaoEdittext.getText().toString(),tianxieyanzhengmaEdittext.getText().toString());
            }
        }
    }


    @Override
    public void onCountdownStart()
    {

    }

    @Override
    public void onCountdownFinish()
    {

    }

    @Override
    public void onCountdownUpdate(int i)
    {

    }

    @Override
    public TextView OnGetShowTextView()
    {
        return null;
    }

    @OnClick({R.id.fasongyanzhengma_md, R.id.picyanzhengma_webview, R.id.queding_btn})
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.fasongyanzhengma_md:
                shoujihaoEdittext.setError(null);
                if(shoujihaoEdittext.getText().toString().equals(""))
                {
                    shoujihaoEdittext.setError("请输入手机号");
                }
                else if(!isMobileNO(shoujihaoEdittext.getText().toString()))
                {
                    shoujihaoEdittext.setError("手机号格式错误");
                }
                else
                {
                    countdown = new Countdown(fasongyanzhengmaMd,"%s秒后可再次发送");
                    countdown.setCountdownListener(this);
                    countdown.start();
                    mModel.getYanZhengMa(getResources().getString(R.string.zhuce_getyanzhengma_trancode),shoujihaoEdittext.getText().toString());
                }
                break;
            case R.id.picyanzhengma_webview://
                clearFrescoCache();
                picyanzhengmaWebview.setImageURI(Uri.parse(getResources().getString(R.string.http_request_url) + "/system/createvalicode"));
                break;
            case R.id.queding_btn:
                shoujihaoEdittext.setError(null);

                tianxieyanzhengmaLayout.setError(null);

                if(isValida())
                {

                    mModel.validataVCode(getResources().getString(R.string.zhuce_yzyanzhengma_trancode),tianxieyanzhengmaEdittext.getText().toString());
                }
                break;
        }
    }

    public boolean isValida()
    {
        if (shoujihaoEdittext.getText().toString().equals(""))
        {
            shoujihaoEdittext.setError("请输入手机号");
            return false;
        } else if (tianxieyanzhengmaEdittext.getText().toString().equals(""))
        {
            tianxieyanzhengmaLayout.setError("请输入收到的验证码");
        }
        return true;
    }
    /**
     * 判断手机号
     * @param mobiles
     * @return
     */
    public static boolean isMobileNO(String mobiles)
    {
        Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");

        Matcher m = p.matcher(mobiles);

        System.out.println(m.matches() + "---");

        return m.matches();

    }


    public void clearFrescoCache()
    {
        ImagePipeline imagePipeline = Fresco.getImagePipeline();

        //imagePipeline.evictFromMemoryCache(Uri.parse(getResources().getString(R.string.http_request_url) + "/system/createvalicode"));
        //imagePipeline.evictFromDiskCache(Uri.parse(getResources().getString(R.string.http_request_url) + "/system/createvalicode"));

// combines above two lines
        imagePipeline.evictFromCache(Uri.parse(getResources().getString(R.string.http_request_url) + "/system/createvalicode"));
    }
}
