package com.pmumentor.model;

public class Content {
    private String title;
    private String url;

    public Content(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
}
