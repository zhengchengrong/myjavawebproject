package com.zcr.upms.rpc.api;

import com.zcr.common.base.BaseService;
import com.zcr.upms.dao.model.UpmsUserOrganization;
import com.zcr.upms.dao.model.UpmsUserOrganizationExample;

/**
* UpmsUserOrganizationService接口
* Created by shuzheng on 2018/8/9.
*/
public interface UpmsUserOrganizationService extends BaseService<UpmsUserOrganization, UpmsUserOrganizationExample> {
    /**
     * 用户组织
     * @param organizationIds 组织ids
     * @param id 用户id
     * @return
     */
    int organization(String[] organizationIds, int id);

}