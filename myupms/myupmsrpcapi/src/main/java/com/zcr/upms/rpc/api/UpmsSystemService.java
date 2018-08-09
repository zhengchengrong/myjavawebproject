package com.zcr.upms.rpc.api;

import com.zcr.common.base.BaseService;
import com.zcr.upms.dao.model.UpmsSystem;
import com.zcr.upms.dao.model.UpmsSystemExample;

/**
* UpmsSystemService接口
* Created by shuzheng on 2018/8/9.
*/
public interface UpmsSystemService extends BaseService<UpmsSystem, UpmsSystemExample> {
    /**
     * 根据name获取UpmsSystem
     * @param name
     * @return
     */
    UpmsSystem selectUpmsSystemByName(String name);
}