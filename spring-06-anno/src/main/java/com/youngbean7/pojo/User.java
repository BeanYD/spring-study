package com.youngbean7.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component 组件 等价于 <bean id="user" class="com.youngbean7.pojo.User">
@Component
public class User {

    // 相当于 <property name="name" value="youngbean">
    @Value("youngbean")
    public String name;
}
