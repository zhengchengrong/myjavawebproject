package com.zcr.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.zcr.common.base.BaseServiceMock;
import com.zcr.upms.dao.mapper.UpmsPermissionMapper;
import com.zcr.upms.dao.model.UpmsPermission;
import com.zcr.upms.dao.model.UpmsPermissionExample;

/**
* 降级实现UpmsPermissionService接口
* Created by shuzheng on 2018/8/9.
*/
public class UpmsPermissionServiceMock extends BaseServiceMock<UpmsPermissionMapper, UpmsPermission, UpmsPermissionExample> implements UpmsPermissionService {

    @Override
    public JSONArray getTreeByRoleId(Integer roleId) {
        return null;
    }

    @Override
    public JSONArray getTreeByUserId(Integer usereId, Byte type) {
        return null;
    }
}
