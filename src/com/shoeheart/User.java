package com.shoeheart;

/**
 * Created by Nathan on 8/8/17.
 */
public class User {
    public String username;
    public String email;
    public String firstName;
    public String lastName;

    public User(String username, String email, String firstName, String lastName) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String displayName() {
        return firstName + " " + lastName;
    }

    public String sortName() {
        return lastName + ", " + firstName;
    }
}
