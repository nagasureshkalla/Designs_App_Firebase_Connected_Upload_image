package com.example.designs.model;

import java.io.Serializable;

public class Images implements Serializable {

    public String url;
    private String name;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Images(String url, String name) {
        this.url = url;
        this.name = name;
    }
}
