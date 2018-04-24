package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {
    public String share() {
        return "[Twitter predictor] Shared post on Twitter";
    }
}
