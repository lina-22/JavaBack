package com.javaProject.javaBack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "book")
public class Book{

    @Id
    @Column
    private long id;

    @Column
    private String name;
    @Column
    private String writer;
    @Column
    private String publishyear;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublishYear() {
        return publishyear;
    }

    public void setPublishYear(String publishYear) {
        this.publishyear = publishYear;
    }
}
