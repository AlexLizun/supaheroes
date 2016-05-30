package com.company;


import java.util.ArrayList;

/**
 * Created by alexis on 26.05.2016.
 */

public class Superhero {
    private String id;
    private String name;
    private String surname;
    private String login;



    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return String.format(id + " " + name + " " + surname + " " + login);
    }
// отправь на github, как сделаешь :)
    //override tostring java - в гугле
      //      и первая ссылка на stackoverflow :)
}
