package com.zcr.upms.rpc.service.impl;

import com.zcr.common.annotation.BaseService;
import com.zcr.common.base.BaseServiceImpl;
import com.zcr.upms.dao.mapper.UpmsSystemMapper;
import com.zcr.upms.dao.model.UpmsSystem;
import com.zcr.upms.dao.model.UpmsSystemExample;
import com.zcr.upms.rpc.api.UpmsSystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* UpmsSystemService实现
* Created by shuzheng on 2018/8/9.
*/
@Service
@Transactional
@BaseService
public class UpmsSystemServiceImpl extends BaseServiceImpl<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsSystemServiceImpl.class);

    @Autowired
    UpmsSystemMapper upmsSystemMapper;

    @Override
    public UpmsSystem selectUpmsSystemByName(String name) {
        UpmsSystemExample upmsSystemExample = new UpmsSystemExample();
        upmsSystemExample.createCriteria()
                .andNameEqualTo(name);
        List<UpmsSystem> upmsSystems = upmsSystemMapper.selectByExample(upmsSystemExample);
        if (null != upmsSystems && upmsSystems.size() > 0) {
            return upmsSystems.get(0);
        }
        return null;
    }

}