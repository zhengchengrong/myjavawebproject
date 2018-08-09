package com.zcr.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.zcr.common.base.BaseServiceMock;
import com.zcr.upms.dao.mapper.UpmsUserPermissionMapper;
import com.zcr.upms.dao.model.UpmsUserPermission;
import com.zcr.upms.dao.model.UpmsUserPermissionExample;

/**
* 降级实现UpmsUserPermissionService接口
* Created by shuzheng on 2018/8/9.
*/
public class UpmsUserPermissionServiceMock extends BaseServiceMock<UpmsUserPermissionMapper, UpmsUserPermission, UpmsUserPermissionExample> implements UpmsUserPermissionService {

    @Override
    public int permission(JSONArray datas, int id) {
        return 0;
    }
}
