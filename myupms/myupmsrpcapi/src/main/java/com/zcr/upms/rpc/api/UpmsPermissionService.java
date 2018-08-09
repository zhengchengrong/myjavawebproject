package com.zcr.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.zcr.common.base.BaseService;
import com.zcr.upms.dao.model.UpmsPermission;
import com.zcr.upms.dao.model.UpmsPermissionExample;

/**
* UpmsPermissionService接口
* Created by shuzheng on 2018/8/9.
*/
public interface UpmsPermissionService extends BaseService<UpmsPermission, UpmsPermissionExample> {
    JSONArray getTreeByRoleId(Integer roleId);

    JSONArray getTreeByUserId(Integer usereId, Byte type);
}