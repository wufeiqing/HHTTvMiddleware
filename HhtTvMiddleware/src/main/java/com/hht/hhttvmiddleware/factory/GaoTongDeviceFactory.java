package com.hht.hhttvmiddleware.factory;

import com.hht.hhttvmiddleware.device.GaoTongDevice;
import com.hht.hhttvmiddleware.device.HHTDevice;

/**
 * Author：wufq on 2018/4/24 10:36
 * Email：wufeiqing@@honghe-tech.com
 *
 * @TODO: GaoTongDeviceFactory 工厂类
 */

public class GaoTongDeviceFactory implements IFactory {
    @Override
    public HHTDevice createDevice() {
        return new GaoTongDevice();
    }
}
