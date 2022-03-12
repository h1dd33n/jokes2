package com.jokedata.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="users")
public class User {
    @Id
    private Long id;
    @Column(name="firstName", nullable = false, length = 64)
    private String firstName;
    @Column(name="lastName", nullable = false, length = 64)
    private String lastName;
    @Column(name="email", nullable = false, length = 64, unique = true)
    private String email;
    @Column(name="password", nullable = false, length = 64)
    private String password;


    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
