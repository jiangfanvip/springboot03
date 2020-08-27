package com.jiangfan.springboot03.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 江帆
 * @Date: 2020/6/21
 * @Description: com.jiangfan.springboot03.entity
 * @version: 1.0
 */
//@ConfigurationProperties(prefix = "person") 告诉springBoot本类中属性和相关的配置进行数据绑定
//prefix = "person"  配置文件下哪个属性进行一一映射
//只有是容器组件才会生效

@Component
@PropertySource(value = {"classpath:person.properties"})
@ConfigurationProperties(prefix = "person")
public class Person {
  //  @Value("${person.last-name}")
    private String lastName;
   // @Value("#{11*2*3}")
    private Integer age;
   // @Value("false")
    private Boolean isBoss;
  //  @Value("2019/12/03")
    private Date birth;

    private Map<String, Object> map;

    private List lists;

    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return isBoss;
    }

    public void setBoss(Boolean boss) {
        isBoss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List getLists() {
        return lists;
    }

    public void setLists(List lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isBoss=" + isBoss +
                ", birth=" + birth +
                ", map=" + map +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
