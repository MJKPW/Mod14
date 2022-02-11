package com.kodilla.patterns2.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Twitter";
    }
}
