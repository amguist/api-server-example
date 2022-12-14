package com.hawkeye.api.server.examples.hello.service.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HelloResponse {

    private String name;
    private Date responseDate;

    public String getName() {
        return name;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }
}
