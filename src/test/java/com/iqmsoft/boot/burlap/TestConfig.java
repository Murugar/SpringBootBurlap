package com.iqmsoft.boot.burlap;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.BurlapProxyFactoryBean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import com.iqmsoft.boot.burlap.BurlapService;

@Configuration
public class TestConfig {

    @Bean
    public BurlapProxyFactoryBean burlapClient() {
        BurlapProxyFactoryBean factory = new BurlapProxyFactoryBean();
        factory.setServiceUrl("http://localhost:8080/BurlapService");
        factory.setServiceInterface(BurlapService.class);
        return factory;
    }
}
