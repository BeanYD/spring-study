## 常用依赖
```xml
        <!--https://mvnrepository.com/artifact/org.springframework/spring-webmvc-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.3.8</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13</version>
            <scope>test</scope>
        </dependency>
```

## 装配文件内容
### 普通装配
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">


</beans>
```
### p和c命名空间装配
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:p="http://www.springframework.org/schema/p"
       xmlns:c="http://www.springframework.org/schema/c"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

<!--    p命名空间：set注入、c命名空间：构造器注入-->

    <bean id="user" class="com.youngbean7.pojo.User" p:name="youngBean" p:age="18"/>
    <bean id="user2" class="com.youngbean7.pojo.User" c:name="oldBean" c:age="88" scope="prototype" />

<!--
        scope="singleton" : 单例模式（默认）
        scope="prototype" : 原型模式
        -->
</beans>
```
### 添加注解的自动装配，在属性或set方法前
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd">

    <context:annotation-config/>
</beans>
```

## 注解说明
- @Autowired : 自动装配通过类型。名字
    如果Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value="xxx)
- @Nullable  : 字段标记注解可以为null
- @Resource  : 自动装配通过名字。类型
  
- @Component : 组件，放在类上，说明这个类被Spring管理了，就是bean！
### 衍生注解
@Component有几个衍生注解，我们在web开发中，会按照mvc三层架构分层
- dao 【@Repository】
- service 【@Service】
- controller 【@Controller】
这四个注解是一样的，都能代表将某个类注册到Spring中，装配Bean
  
## 使用Java的方式配置Spring
完全不使用Spring的xml配置，全部交给Java来做
详细代码见工程`spring-study`中`spring-07-appconfig`。