package com.kuro4king.crud.model;

import java.util.Date;

public class Post {
    private Long id;
    private String content;
    private Date created;
    private Date updated;

    public Post(Long id, String content, Date created, Date updated) {
        this.id = id;
        this.content = content;
        this.created = created;
        this.updated = updated;
    }

    public String toString() {
        return "\n" + this.id + ". " + this.content + "\nДата создания: " + this.created + "\nДата изменения: " + this.updated;
    }
    public String write() {
        return this.id + ". " + this.content + " Дата создания: " + this.created + " Дата изменения: " + this.updated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}

