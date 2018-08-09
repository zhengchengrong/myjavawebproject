package com.zcr.upms.rpc.api;

import com.zcr.common.base.BaseServiceMock;
import com.zcr.upms.dao.mapper.UpmsUserMapper;
import com.zcr.upms.dao.model.UpmsUser;
import com.zcr.upms.dao.model.UpmsUserExample;

/**
* 降级实现UpmsUserService接口
* Created by shuzheng on 2018/8/9.
*/
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

    @Override
    public UpmsUser createUser(UpmsUser upmsUser) {
        return null;
    }
}
