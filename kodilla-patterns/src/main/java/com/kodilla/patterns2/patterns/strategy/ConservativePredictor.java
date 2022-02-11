package com.kodilla.patterns2.patterns.strategy;

public class ConservativePredictor implements BuyPredictor {

    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}
