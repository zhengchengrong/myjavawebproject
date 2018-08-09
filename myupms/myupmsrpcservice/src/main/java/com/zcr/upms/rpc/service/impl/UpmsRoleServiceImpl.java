package com.zcr.upms.rpc.service.impl;

import com.zcr.common.annotation.BaseService;
import com.zcr.common.base.BaseServiceImpl;
import com.zcr.upms.dao.mapper.UpmsRoleMapper;
import com.zcr.upms.dao.model.UpmsRole;
import com.zcr.upms.dao.model.UpmsRoleExample;
import com.zcr.upms.rpc.api.UpmsRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsRoleService实现
* Created by shuzheng on 2018/8/9.
*/
@Service
@Transactional
@BaseService
public class UpmsRoleServiceImpl extends BaseServiceImpl<UpmsRoleMapper, UpmsRole, UpmsRoleExample> implements UpmsRoleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsRoleServiceImpl.class);

    @Autowired
    UpmsRoleMapper upmsRoleMapper;

}