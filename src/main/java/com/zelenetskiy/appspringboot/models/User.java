package com.zelenetskiy.appspringboot.models;

import javax.persistence.*;

@Entity
@Table (name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name ="name")
    private String name;
    @Column(name ="last_name")
    private String last_name;
    @Column(name ="age")
    private Byte age;
    @Column(name ="email")
    private String email;

    public User(String name, String last_name, Byte age, String email) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.email = email;
    }

    public User() {
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

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String lastName) {
        this.last_name = lastName;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age + '\'' +
                ", email=" + email +
                '}'
                ;
    }
}
