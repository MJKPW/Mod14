package com.kodilla.patterns2.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {

    @Override
    public String share() {
        return "Snapchat";
    }
}
