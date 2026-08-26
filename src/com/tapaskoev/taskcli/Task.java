package com.tapaskoev.taskcli;

import java.time.LocalDateTime;

public class Task {

    private int id;
    private String description;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public Task(int id, String description){
        this.id = id;
        this.description = description;
        this.status = "TO-DO";

        //Añadimos de forma automatica las fechas
        this.createdAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
    }

    //Creamos los Getters
    public int getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    public String getStatus(){
        return status;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public LocalDateTime getUpdateAt(){
        return updateAt;
    }

    //Creamos los Setters
    public void setId(int id){
        this.id = id;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setStatus(String status){
        this.status = status;
    }


    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString(){
        return "Task: " +
                "ID: " + id +
                ", Description: " + description +
                ", Status: " + status +
                ", CreatedAt: " + createdAt +
                ", UpdateAt: " + updateAt;
    }

    public String toJson(){
        return "{\n" +
                "\t\"id\": " + id + ", \n" +
                "\t\"description\": \"" + description + "\", \n" +
                "\t\"status\": \"" + status + "\", \n" +
                "\t\"createdAt\": \"" + createdAt + "\", \n" +
                "\t\"updateAt\": \"" + updateAt + "\" " +
                "\n}";
    }
}