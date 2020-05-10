package com.yao.springConfig.config;

import com.yao.springConfig.domain.Person;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author yaojian
 * @date 2020/5/10 21:29
 */

@Configuration
//Spring Boot通过@ConditionalOnProperty来控制Configuration是否生效
//通过其两个属性name以及havingValue来实现的，其中name用来从application.properties中读取某个属性值。
// matchIfMissing属性：从application.properties中读取某个属性值，如果该值为空，默认值为true
//如果该值为空，则返回false;
//如果值不为空，则将该值与havingValue指定的值进行比较，如果一样则返回true;否则返回false。
//如果返回值为false，则该configuration不生效；为true则生效。
@ConditionalOnProperty(prefix = "person",name = "person.config.open",havingValue = "true",matchIfMissing = true)
@EnableConfigurationProperties(Person.class)
public class PersonAutoConfiguration {



}
