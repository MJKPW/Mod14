package com.kodilla.patterns2.patterns.strategy.social;

public class ZGeneration extends User {

    public ZGeneration(String name) {
        super(name);
        super.publisher = new SnapchatPublisher();
    }
}
