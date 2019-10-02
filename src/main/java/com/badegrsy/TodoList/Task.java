package com.badegrsy.TodoList;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class Task {

    private @Id @GeneratedValue Long id;
    private String name;
    private boolean status = false;

    Task() {}

    Task(String name) {
        this.name = name;
        this.status = status;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public boolean getStatus()
    {
        return status;
    }
}
