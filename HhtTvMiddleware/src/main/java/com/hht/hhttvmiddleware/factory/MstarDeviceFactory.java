package com.hht.hhttvmiddleware.factory;

import com.hht.hhttvmiddleware.device.HHTDevice;
import com.hht.hhttvmiddleware.device.MstarDevice;

/**
 * Author：wufq on 2018/4/24 10:35
 * Email：wufeiqing@@honghe-tech.com
 *
 * @TODO: MstarDeviceFactory 工厂类
 */

public class MstarDeviceFactory implements IFactory {
    @Override
    public HHTDevice createDevice() {
        return new MstarDevice();
    }
}
