package com.youngbean7.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Person {

    // 如果显示定义了Autowired的required属性为false，说明这个对象可以为null，否则不允许为null
    @Autowired(required = false)
    // 无法通过byName和byType找到对应装配的对象时，使用注解Qualifier指定装配对象id
    @Qualifier(value = "dog1")
    private Dog dog;
//    @Autowired
//    @Qualifier(value = "cat1")

    // java原生注解：先通过id去查找，查找规则与byName相同。如果通过id无法找到，再通过类型查找，规则与byType相同
//    @Resource
    @Resource(name = "cat1")
    private Cat cat;
    private String name;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() { return cat; }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
