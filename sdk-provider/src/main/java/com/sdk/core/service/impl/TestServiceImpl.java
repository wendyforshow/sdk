package com.sdk.core.service.impl;

import com.sdk.core.service.TestService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

@DubboService(version = "1.0.0", group = "sdk-test")
public class TestServiceImpl implements TestService {

    @Value("${server.name}")
    private String SERVER_NAME;

    @Value("${server.port}")
    private String SERVER_PORT;

    @Override
    public String getServerDetail() {
        StringBuilder sb = new StringBuilder().append("当前服务信息：");
        sb.append("\r\n");
        sb.append("服务名称：").append(SERVER_NAME)
                .append(" 服务地址：127.0.0.1:").append(SERVER_PORT);
        return sb.toString();
    }
}
