package com.zcr.upms.rpc.api;

import com.zcr.common.base.BaseService;
import com.zcr.upms.dao.model.UpmsUser;
import com.zcr.upms.dao.model.UpmsUserExample;

/**
* UpmsUserService接口
* Created by shuzheng on 2018/8/9.
*/
public interface UpmsUserService extends BaseService<UpmsUser, UpmsUserExample> {
    UpmsUser createUser(UpmsUser upmsUser);

}