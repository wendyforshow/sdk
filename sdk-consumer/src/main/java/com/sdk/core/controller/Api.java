package com.sdk.core.controller;

import com.sdk.core.service.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Api {

    @Value("${server.name}")
    private String SERVER_NAME;

    @Value("${server.port}")
    private String SERVER_PORT;

    @DubboReference(version = "1.0.0", group = "sdk-test")
    private TestService testService;

    @RequestMapping("/server")
    public String getServer () {
        StringBuilder sb = new StringBuilder().append("当前服务信息：");
        sb.append("\r\n");
        sb.append("服务名称：").append(SERVER_NAME)
                .append(" 服务地址：127.0.0.1:").append(SERVER_PORT);
        return sb.toString();
    }

    @RequestMapping("/dubbo")
    public String getDubboServer () {
        StringBuilder sb = new StringBuilder().append("当前服务信息：");
        sb.append("\r\n");
        sb.append("服务名称：").append(SERVER_NAME)
                .append(" 服务地址：127.0.0.1:").append(SERVER_PORT)
                .append("\r\n")
                .append("远程服务信息获取:")
                .append("\r\n")
                .append(testService.getServerDetail());
        return sb.toString();
    }
}
