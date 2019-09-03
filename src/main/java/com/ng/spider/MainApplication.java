package com.ng.spider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.elasticsearch.ElasticSearchClientHealthIndicatorAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

//@MapperScan({"com.ng.spider.dao"})
@SpringBootApplication(
        exclude={
                ElasticSearchClientHealthIndicatorAutoConfiguration.class,
                ElasticsearchAutoConfiguration.class

        }
)
@EnableScheduling
public class MainApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MainApplication.class);
    }

    public static void main(String[] args) {
        //elasticClient 报错
//        System.setProperty("es.set.netty.runtime.available.processors", "false");

        SpringApplication.run(MainApplication.class, args);
    }

}

