## 常用依赖
```xml
<dependency>
<groupId>org.springframework</groupId>
<artifactId>spring-webmvc</artifactId>
<version>5.2.25.RELEASE</version>
</dependency>
<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>4.13.2</version>
<scope>test</scope>
</dependency>
```
## 注解说明
- @Autowired:自动装配通过类型名字
    如果Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value=""fdsfs")
- @Nullable 字段标记了这个注解，说明这个字段可以为null
- @Resource：自动装配通过名字、类型
- @Component 说明这个类被spring管理了，就是bean
    @Component有三个衍生注解,在web开发中，会按照MVC三层架构分层
    - dao [@Repository]
    - service [@Service]
    - controller [@Controller]
- @Value类似于注入值
- @Scope 作用域注解可设置单例或原型模式
![img.png](img.png)
- 

