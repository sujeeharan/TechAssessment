package com.example.demo.entity;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table
public class Comment {

    @JoinColumn(name = "post_id")
    private Integer postId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;
    private String email;
    private String body;

    @CreatedDate
    private Timestamp createdOn;
    @LastModifiedDate
    private Timestamp modifiedOn;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Timestamp modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
}
