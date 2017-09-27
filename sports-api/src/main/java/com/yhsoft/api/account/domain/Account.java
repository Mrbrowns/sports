package com.yhsoft.api.account.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Date;

@Entity
@Slf4j
@Table(name = "sys_account")
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue
    @NonNull
    private Integer id;
    @Column(name = "name")
    @NonNull
    private String name;
    @Column(name = "password")
    @JsonIgnore
    @NonNull
    private String password;
    @Column(name = "username")
    @NonNull
    private String username;
    @Column(name = "division_id")
    private Integer divisionId;
    @Column(name = "email")
    private String email;
    @Column(name = "gender")
    private String gender;
    @Column(name = "mobilephone")
    private String mobilephone;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "user_type")
    private Integer userType;
    @Column(name = "create_by")
    private String createBy;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "update_by")
    private String updateBy;
    @Column(name = "update_time")
    private Date updateTime;
    @Column(name = "disabled")
    private Integer disabled;
    @Column(name = "theme")
    private String theme;
    @Column(name = "is_ldap")
    private Integer isLdap;
}
