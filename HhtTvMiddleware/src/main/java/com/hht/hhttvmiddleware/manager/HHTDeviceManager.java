package com.hht.hhttvmiddleware.manager;

import android.content.Context;

import com.hht.hhttvmiddleware.device.HHTDevice;
import com.hht.hhttvmiddleware.factory.GaoTongDeviceFactory;
import com.hht.hhttvmiddleware.factory.IFactory;
import com.hht.hhttvmiddleware.factory.MstarDeviceFactory;

/**
 * Author：wufq on 2018/4/24 11:02
 * Email：wufeiqing@@honghe-tech.com
 *
 * @TODO: 设备管理类
 */

public class HHTDeviceManager {
    private IFactory iFactory = null;
    private HHTDevice hhtDevice = null;
    private Context context;
//    private static HHTDeviceManager instance = null;
    private HHTDeviceManager(){}
//    public static synchronized HHTDeviceManager getInstance(){
//        if (instance == null){
//            synchronized (HHTDeviceManager.class){
//                if (instance == null){
//                    instance = new HHTDeviceManager();
//                }
//            }
//        }
//        return instance;
//    }

    //静态内部类单例
    private static class SingletonHolder{
        private final static HHTDeviceManager INSTANCE = new HHTDeviceManager();
    }

    public static HHTDeviceManager getInstance(){
        return SingletonHolder.INSTANCE;
    }

    /**
     * 初始化参数
     * @param context
     * @return
     */
    public HHTDeviceManager init(Context context){
        this.context = context;
        String deviceType = getDeviceType();
        if (deviceType.equals("mstar")){
            iFactory = new MstarDeviceFactory();
            hhtDevice = iFactory.createDevice();
        } else if (deviceType.equals("gaotong")){
            iFactory = new GaoTongDeviceFactory();
            hhtDevice = iFactory.createDevice();
        }
        return this;
    }

    private String deviceType = "mstar";
    /**
     * 获取设备类型
     * @return
     */
    private String getDeviceType(){
        return deviceType;
    }

    public void setDeviceType(String deviceType){
        this.deviceType = deviceType;
    }

    private void assertNullException(){
        if (null == context)
            throw new NullPointerException("context is null");
    }

    /**
     * 护眼模式是否开启
     * @return
     */
    public boolean isEyemodeEnable(){
        assertNullException();
        return hhtDevice.isEyemodeEnable(context);
    }

    /**
     * 设置护眼模式开与关
     * @param enable
     */
    public void setEyemodeEnable(boolean enable){
        assertNullException();
        hhtDevice.setEyemodeEnable(enable);
    }

    /**
     * 护眼书写是否开启
     * @return
     */
    public boolean isWbWriteProtectEnable(){
        assertNullException();
        return hhtDevice.isWbWriteProtectEnable(context);
    }

    /**
     * 护眼书写开与关
     * @param enable
     */
    public void setWbWriteProtectEnable(boolean enable){
        assertNullException();
        hhtDevice.setWbWriteProtectEnable(enable);
    }

    /**
     * 护眼光控是否开启
     * @return
     */
    public boolean isBlightControlEnable(){
        assertNullException();
        return hhtDevice.isBlightControlEnable(context);
    }

    /**
     * 护眼光控开与关
     * @param enable
     */
    public void setBlightControlEnable(boolean enable){
        assertNullException();
        hhtDevice.setBlightControlEnable(enable);
    }
}
