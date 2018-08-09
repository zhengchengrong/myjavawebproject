package com.zcr.upms.rpc.service.impl;

import com.zcr.common.annotation.BaseService;
import com.zcr.common.base.BaseServiceImpl;
import com.zcr.upms.dao.mapper.UpmsUserRoleMapper;
import com.zcr.upms.dao.model.UpmsUserRole;
import com.zcr.upms.dao.model.UpmsUserRoleExample;
import com.zcr.upms.rpc.api.UpmsUserRoleService;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsUserRoleService实现
* Created by shuzheng on 2018/8/9.
*/
@Service
@Transactional
@BaseService
public class UpmsUserRoleServiceImpl extends BaseServiceImpl<UpmsUserRoleMapper, UpmsUserRole, UpmsUserRoleExample> implements UpmsUserRoleService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsUserRoleServiceImpl.class);

    @Autowired
    UpmsUserRoleMapper upmsUserRoleMapper;

    @Override
    public int role(String[] roleIds, int id) {
        int result = 0;
        // 删除旧记录
        UpmsUserRoleExample upmsUserRoleExample = new UpmsUserRoleExample();
        upmsUserRoleExample.createCriteria()
                .andUserIdEqualTo(id);
        upmsUserRoleMapper.deleteByExample(upmsUserRoleExample);
        // 增加新记录
        if (null != roleIds) {
            for (String roleId : roleIds) {
                if (StringUtils.isBlank(roleId)) {
                    continue;
                }
                UpmsUserRole upmsUserRole = new UpmsUserRole();
                upmsUserRole.setUserId(id);
                upmsUserRole.setRoleId(NumberUtils.toInt(roleId));
                result = upmsUserRoleMapper.insertSelective(upmsUserRole);
            }
        }
        return result;
    }
}