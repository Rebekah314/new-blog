package org.laughcode.newblog.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class Blog {

    private int id;
    private static int nextId;

    @NotBlank(message = "Title cannot be blank.")
    @Size(min = 10, max = 40, message = "Title must be between 10 and 40 characters.")
    private String title;

    @NotBlank(message = "Content cannot be blank.")
    @Size(min = 5)
    private String content;
    private LocalDate time;
    private Status status;

    public Blog(){
        this.time = LocalDate.now();
        this.id = nextId;
        nextId++;
    }

    public Blog(String title, String content, Status status) {
        this();
        this.title = title;
        this.content = content;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getTime() {
        return time;
    }
}
