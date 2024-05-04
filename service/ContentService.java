package com.pmumentor.service;

import com.pmumentor.model.Content;

import java.util.ArrayList;
import java.util.List;

public class ContentService {
    private List<Content> contents = new ArrayList<>();

    public void shareContent(String title, String url) {
        Content content = new Content(title, url);
        contents.add(content);
        System.out.println("Content shared: " + title);
    }
}
