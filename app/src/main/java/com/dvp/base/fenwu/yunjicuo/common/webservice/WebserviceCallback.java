package com.dvp.base.fenwu.yunjicuo.common.webservice;

import android.os.Handler;
import android.os.Message;

public abstract class WebserviceCallback extends Thread {
    private Object o;
    public Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what == 0) {
                WebserviceCallback.this.handleWebservice(WebserviceCallback.this.o);
            }

            if(msg.what == 1) {
                WebserviceCallback.this.handleWebserviceError();
            }

        }
    };

    public WebserviceCallback() {
    }

    public abstract Object setWebservice() throws Exception;

    public abstract void handleWebserviceError();

    public abstract void handleWebservice(Object var1);

    public void run() {
        super.run();

        try {
            this.o = this.setWebservice();
        } catch (Exception var2) {
            var2.printStackTrace();
            this.mHandler.sendEmptyMessage(1);
        }

        this.mHandler.sendEmptyMessage(0);
    }
}