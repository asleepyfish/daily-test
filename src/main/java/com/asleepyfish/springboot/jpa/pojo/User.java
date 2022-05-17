package com.asleepyfish.springboot.jpa.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/17 19:30
 * @Description: TODO
 */
@Entity
@Table(name = "tb_user")
@Data
public class User {
    /**
     * 标明这是一个主键，自增主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 这是和数据表对应的一个列
     */
    @Column(name = "last_name",length = 50)
    private String lastName;

    /**
     * 默认列名就是属性名
     */
    @Column
    private String email;
}
