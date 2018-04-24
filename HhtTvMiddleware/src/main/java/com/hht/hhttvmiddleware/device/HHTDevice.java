package com.hht.hhttvmiddleware.device;

import android.content.Context;

/**
 * Created by wufq on 2018/4/24.
 */

public abstract class HHTDevice {

    public abstract boolean isEyemodeEnable(Context context);

    public abstract void setEyemodeEnable(boolean enable);

    public abstract boolean isWbWriteProtectEnable(Context context);

    public abstract void setWbWriteProtectEnable(boolean enable);

    public abstract boolean isBlightControlEnable(Context context);

    public abstract void setBlightControlEnable(boolean enable);

}
