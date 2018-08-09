package com.zcr.upms;


import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 服务启动类
 * Created by ZhangShuzheng on 2017/2/3.
 */
public class ZhengUpmsRpcServiceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ZhengUpmsRpcServiceApplication.class);

	public static void main(String[] args) {
		LOGGER.info(">>>>> zheng-upms-rpc-service 正在启动 <<<<<");
		new ClassPathXmlApplicationContext("classpath:*.xml");
		LOGGER.info(">>>>> zheng-upms-rpc-service 启动完成 <<<<<");
	}

}
