package com.zcr.upms.rpc.api;

import com.zcr.common.base.BaseService;
import com.zcr.upms.dao.model.UpmsUserRole;
import com.zcr.upms.dao.model.UpmsUserRoleExample;

/**
* UpmsUserRoleService接口
* Created by shuzheng on 2018/8/9.
*/
public interface UpmsUserRoleService extends BaseService<UpmsUserRole, UpmsUserRoleExample> {
    /**
     * 用户角色
     * @param roleIds 角色ids
     * @param id 用户id
     * @return
     */
    int role(String[] roleIds, int id);
}