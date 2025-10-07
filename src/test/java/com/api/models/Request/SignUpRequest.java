package com.api.models.Request;

public class SignUpRequest {

    String name;
    String job;

    public SignUpRequest(String name, String job) {
        this.name = name;
        this.job = job;
    }


    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "SignUpRequest{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }


}
