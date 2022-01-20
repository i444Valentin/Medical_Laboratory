package com.worldskills.wsapp.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Users {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String login;

    @Column
    private String password;

    @Column
    private String IP;

    @Column
    private String lastenter;


    @Column
    private Integer type;

    public Users(Long id, String name, String login, String password, String IP, String lastenter, ArrayList<Integer> services, Integer type) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.IP = IP;
        this.lastenter = lastenter;
        this.type = type;
    }

    public Users() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getLastenter() {
        return lastenter;
    }

    public void setLastenter(String lastenter) {
        this.lastenter = lastenter;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Пользователи{" +
                "id=" + id +
                ", имя='" + name + '\'' +
                ", логин='" + login + '\'' +
                ", пароль='" + password + '\'' +
                ", IP='" + IP + '\'' +
                ", последнее время входа='" + lastenter + '\'' +
                ", тип пользователя=" + type +
                '}';
    }
}
