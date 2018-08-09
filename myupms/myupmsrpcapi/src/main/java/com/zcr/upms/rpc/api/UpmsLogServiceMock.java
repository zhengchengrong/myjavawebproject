package com.zcr.upms.rpc.api;

import com.zcr.common.base.BaseServiceMock;
import com.zcr.upms.dao.mapper.UpmsLogMapper;
import com.zcr.upms.dao.model.UpmsLog;
import com.zcr.upms.dao.model.UpmsLogExample;

/**
* 降级实现UpmsLogService接口
* Created by shuzheng on 2018/8/9.
*/
public class UpmsLogServiceMock extends BaseServiceMock<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

}
