package com.kodilla.patterns.strategy.social;

public class User {

    private final String name;
    protected SocialPublisher publisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSocialPublisher(SocialPublisher publisher) {
        this.publisher = publisher;
    }

    public String sharePublisher() {
        return publisher.share();
    }
}
