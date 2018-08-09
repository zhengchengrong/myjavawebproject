package com.zcr.upms.rpc.api;

import com.zcr.common.base.BaseServiceMock;
import com.zcr.upms.dao.mapper.UpmsUserRoleMapper;
import com.zcr.upms.dao.model.UpmsUserRole;
import com.zcr.upms.dao.model.UpmsUserRoleExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsUserRoleService接口
* Created by shuzheng on 2018/8/9.
*/
public class UpmsUserRoleServiceMock extends BaseServiceMock<UpmsUserRoleMapper, UpmsUserRole, UpmsUserRoleExample> implements UpmsUserRoleService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsUserRoleServiceMock.class);

    @Override
    public int role(String[] roleIds, int id) {
        LOGGER.info("UpmsUserRoleServiceMock => role");
        return 0;
    }
}
