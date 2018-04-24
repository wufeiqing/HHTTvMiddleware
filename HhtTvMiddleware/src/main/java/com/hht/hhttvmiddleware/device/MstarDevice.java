package com.hht.hhttvmiddleware.device;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by wufq on 2018/4/24.
 */

public class MstarDevice extends HHTDevice {
    private boolean eyeModeEnable;
    private boolean wbWriteProtectEnable;
    private boolean blightControlEnable;

    @Override
    public boolean isEyemodeEnable(Context context) {
        show(context,eyeModeEnable,"mstar 护眼模式");
        return eyeModeEnable;
    }

    @Override
    public void setEyemodeEnable(boolean enable) {
        this.eyeModeEnable = enable;
    }

    @Override
    public boolean isWbWriteProtectEnable(Context context) {
        show(context,wbWriteProtectEnable,"mstar 护眼书写");
        return wbWriteProtectEnable;
    }

    @Override
    public void setWbWriteProtectEnable(boolean enable) {
        this.wbWriteProtectEnable = enable;
    }

    @Override
    public boolean isBlightControlEnable(Context context) {
        show(context,blightControlEnable,"mstar 护眼光控");
        return blightControlEnable;
    }

    @Override
    public void setBlightControlEnable(boolean enable) {
        this.blightControlEnable = enable;
    }

    private void show(Context context, boolean flag, String msg) {
        String result = flag ? msg + " 开" : msg + " 关";
        Toast.makeText(context, result, Toast.LENGTH_SHORT).show();
    }
}
