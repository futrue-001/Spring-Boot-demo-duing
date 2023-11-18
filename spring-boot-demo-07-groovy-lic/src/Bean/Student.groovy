package Bean
@Grapes([
    @Grab("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.2.2"),
    @Grab(group='com.mysql', module='mysql-connector-j', version='8.0.31'),
    @Grab("org.projectlombok:lombok:1.18.28"),
    @Grab(group='com.alibaba', module='druid', version='1.2.20')
])


import lombok.Data

@Data
class Student {
    private Integer id;
    private String name;
    private String sex;
    private Date date;
    private Integer cid;
}
