package com.api.models.Response;

public class SignUpResponse {
    private int id;
    private String name;
    private String Job;
    private String createdAt;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }



    public SignUpResponse(int id, String name, String job, String createdAt) {
        this.id = id;
        this.name = name;
        Job = job;
        this.createdAt = createdAt;
    }
    @Override
    public String toString() {
        return "SignUpResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Job='" + Job + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }


    public SignUpResponse() {
    }




}
