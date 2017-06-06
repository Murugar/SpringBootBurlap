package com.iqmsoft.boot.burlap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.BurlapServiceExporter;
import org.springframework.remoting.caucho.HessianServiceExporter;

@SpringBootApplication
public class Application {

    @Autowired
    private BurlapService burlapService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean(name = "/BurlapService")
    public BurlapServiceExporter accountService() {
        BurlapServiceExporter exporter = new BurlapServiceExporter();
        exporter.setService(burlapService);
        exporter.setServiceInterface(BurlapService.class);
        return exporter;
    }


}
