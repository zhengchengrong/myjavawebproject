package com.zcr.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.zcr.common.base.BaseService;
import com.zcr.upms.dao.model.UpmsUserPermission;
import com.zcr.upms.dao.model.UpmsUserPermissionExample;

/**
* UpmsUserPermissionService接口
* Created by shuzheng on 2018/8/9.
*/
public interface UpmsUserPermissionService extends BaseService<UpmsUserPermission, UpmsUserPermissionExample> {
    /**
     * 用户权限
     * @param datas 权限数据
     * @param id 用户id
     * @return
     */
    int permission(JSONArray datas, int id);
}