package com.pmumentor.service;

import com.pmumentor.model.Event;

import java.util.ArrayList;
import java.util.List;

public class EventService {
    private List<Event> events = new ArrayList<>();

    public void createEvent(String title, String description) {
        Event event = new Event(title, description);
        events.add(event);
        System.out.println("Event created: " + title);
    }
}
