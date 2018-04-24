package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {
    public String share() {
        return "[Snapchat predictor] Shared post on Snapchat";
    }
}
