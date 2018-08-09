package com.zcr.upms.rpc.api;

import com.zcr.common.base.BaseServiceMock;
import com.zcr.upms.dao.mapper.UpmsUserOrganizationMapper;
import com.zcr.upms.dao.model.UpmsUserOrganization;
import com.zcr.upms.dao.model.UpmsUserOrganizationExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 降级实现UpmsUserOrganizationService接口
* Created by shuzheng on 2018/8/9.
*/
public class UpmsUserOrganizationServiceMock extends BaseServiceMock<UpmsUserOrganizationMapper, UpmsUserOrganization, UpmsUserOrganizationExample> implements UpmsUserOrganizationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsUserOrganizationServiceMock.class);

    @Override
    public int organization(String[] organizationIds, int id) {
        LOGGER.info("UpmsUserOrganizationServiceMock => organization");
        return 0;
    }
}
