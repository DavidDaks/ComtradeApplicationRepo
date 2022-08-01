package com.ComtradeApp.ComtradeApplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name = "Tbl_hello_worlds")
public class HelloWorldModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String word;
    private String lang;

    public HelloWorldModel() {

    }

    public HelloWorldModel(String word, String language) {
        this.word = word;
        this.lang = language;
    }

    public String getWord() {
        return word;
    }

    public String getLang() {
        return lang;
    }

    @Override
    public String toString() {
        return "HelloWorldModel{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", language='" + lang + '\'' +
                '}';
    }
}
