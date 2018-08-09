package com.zcr.upms.rpc.api;

import com.zcr.common.base.BaseServiceMock;
import com.zcr.upms.dao.mapper.UpmsSystemMapper;
import com.zcr.upms.dao.model.UpmsSystem;
import com.zcr.upms.dao.model.UpmsSystemExample;

/**
* 降级实现UpmsSystemService接口
* Created by shuzheng on 2018/8/9.
*/
public class UpmsSystemServiceMock extends BaseServiceMock<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

    @Override
    public UpmsSystem selectUpmsSystemByName(String name) {
        return null;
    }
}
