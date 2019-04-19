package com.shyam.springaop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.shyam.springaop")
@Configuration
@EnableAspectJAutoProxy
public class DemoConfig {

}
