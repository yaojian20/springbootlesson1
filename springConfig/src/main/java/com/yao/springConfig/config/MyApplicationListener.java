package com.yao.springConfig.config;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yaojian
 * @date 2020/4/25 22:28
 */
public class MyApplicationListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent>, Ordered {
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent) {
        ConfigurableEnvironment env = applicationEnvironmentPreparedEvent.getEnvironment();
        MutablePropertySources mutablePropertySources = env.getPropertySources();
        Map<String,Object> source = new HashMap<>();
        source.put("server.port",5678);
        PropertySource propertySource = new MapPropertySource("myapplication",source);
        mutablePropertySources.addFirst(propertySource);

    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
