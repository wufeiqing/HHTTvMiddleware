package com.hht.hhtmiddlewaredemo;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.hht.hhttvmiddleware.device.HHTDevice;
import com.hht.hhttvmiddleware.factory.GaoTongDeviceFactory;
import com.hht.hhttvmiddleware.factory.IFactory;
import com.hht.hhttvmiddleware.factory.MstarDeviceFactory;
import com.hht.hhttvmiddleware.manager.HHTDeviceManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, RadioGroup
        .OnCheckedChangeListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button eyeBtn1, eyeBtn2, wbBtn1, wbBtn2, blightBtn1, blightBtn2;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        eyeBtn1 = (Button) findViewById(R.id.btn_eye_1);
        eyeBtn2 = (Button) findViewById(R.id.btn_eye_2);
        wbBtn1 = (Button) findViewById(R.id.btn_wb_1);
        wbBtn2 = (Button) findViewById(R.id.btn_wb_2);
        blightBtn1 = (Button) findViewById(R.id.btn_blight_1);
        blightBtn2 = (Button) findViewById(R.id.btn_blight_2);
        radioGroup = (RadioGroup) findViewById(R.id.rg);

        eyeBtn1.setOnClickListener(this);
        eyeBtn2.setOnClickListener(this);
        wbBtn1.setOnClickListener(this);
        wbBtn2.setOnClickListener(this);
        blightBtn1.setOnClickListener(this);
        blightBtn2.setOnClickListener(this);

        radioGroup.setOnCheckedChangeListener(this);
    }

    private boolean eyeModeEnable = true;
    private boolean wbWriteProjectEnable = true;
    private boolean blightControlEnable = true;

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_eye_1:
//                HHTDeviceManager.getInstance().isEyemodeEnable();
                HHTDeviceManager.INSTANCE.isEyemodeEnable();
                break;
            case R.id.btn_eye_2:
//                HHTDeviceManager.getInstance().setEyemodeEnable(eyeModeEnable);
                HHTDeviceManager.INSTANCE.setEyemodeEnable(eyeModeEnable);
                eyeModeEnable = !eyeModeEnable;
                break;
            case R.id.btn_wb_1:
//                HHTDeviceManager.getInstance().isWbWriteProtectEnable();
                HHTDeviceManager.INSTANCE.isWbWriteProtectEnable();
                break;
            case R.id.btn_wb_2:
//                HHTDeviceManager.getInstance().setWbWriteProtectEnable(wbWriteProjectEnable);
                HHTDeviceManager.INSTANCE.setWbWriteProtectEnable(wbWriteProjectEnable);
                wbWriteProjectEnable = !wbWriteProjectEnable;
                break;
            case R.id.btn_blight_1:
//                HHTDeviceManager.getInstance().isBlightControlEnable();
                HHTDeviceManager.INSTANCE.isBlightControlEnable();
                break;
            case R.id.btn_blight_2:
//                HHTDeviceManager.getInstance().setBlightControlEnable(blightControlEnable);
                HHTDeviceManager.INSTANCE.setBlightControlEnable(blightControlEnable);
                blightControlEnable = !blightControlEnable;
                break;
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, @IdRes int id) {
        switch (id) {
            case R.id.radio1:
                reset("mstar");
                break;
            case R.id.radio2:
                reset("gaotong");
                break;
        }
    }

    /**
     * 重置
     *
     * @param type
     */
    private void reset(String type) {
        eyeModeEnable = true;
        wbWriteProjectEnable = true;
        blightControlEnable = true;
//        HHTDeviceManager.getInstance().setDeviceType(type);
//        HHTDeviceManager.getInstance().init(getApplicationContext());
        HHTDeviceManager.INSTANCE.setDeviceType(type);
        HHTDeviceManager.INSTANCE.init(getApplicationContext());
    }
}
