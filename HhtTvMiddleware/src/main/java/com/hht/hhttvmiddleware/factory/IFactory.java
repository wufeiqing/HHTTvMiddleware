package com.hht.hhttvmiddleware.factory;

import com.hht.hhttvmiddleware.device.HHTDevice;

/**
 * Author：wufq on 2018/4/24 10:32
 * Email：wufeiqing@@honghe-tech.com
 *
 * @TODO: 工厂基类
 */

public interface IFactory {
    HHTDevice createDevice();
}
