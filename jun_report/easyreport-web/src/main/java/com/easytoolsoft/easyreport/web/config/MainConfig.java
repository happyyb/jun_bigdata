package com.easytoolsoft.easyreport.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Wujun
 * @date 2017-04-10
 **/
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {
    "com.easytoolsoft.easyreport"
})
public class MainConfig {
}
