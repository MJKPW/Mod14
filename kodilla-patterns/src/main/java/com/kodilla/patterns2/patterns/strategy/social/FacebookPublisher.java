package com.kodilla.patterns2.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Facebook";
    }
}
