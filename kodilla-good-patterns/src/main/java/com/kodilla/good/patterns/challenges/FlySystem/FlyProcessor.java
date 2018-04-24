package com.kodilla.good.patterns.challenges.FlySystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlyProcessor {
    private FlyRepository flyRepository;

    FlyProcessor(FlyRepository flyRepository) {
        this.flyRepository = flyRepository;
    }

    public List<Fly> getFromFly(String city) {
        return flyRepository.getFlyList().stream()
                .filter(n -> n.getFrom().equals(city))
                .collect(Collectors.toList());
    }

    public List<Fly> getToFly(String city) {
        return flyRepository.getFlyList().stream()
                .filter(n -> n.getTo().equals(city))
                .collect(Collectors.toList());
    }

    public List<Fly> getThroughFly1Param(String interCity) {
        return flyRepository.getFlyList().stream()
                .filter(n -> n.getTo().equals(interCity) || n.getFrom().equals(interCity))
                .collect(Collectors.toList());
    }

    public List<Fly> getThroughFly2Param(String fromCity, String toCity) {

        List<Fly> resultList = new ArrayList<>();

        flyRepository.getFlyList().stream()
                .filter(n -> n.getFrom().equals(fromCity))
                .forEach(n -> {
                    if (n.getTo().equals(toCity)) {
                        resultList.add(n);
                    } else {
                        flyRepository.getFlyList().stream()
                                .filter(s -> s != n)
                                .filter(s -> s.getFrom().equals(n.getTo()))
                                .filter(s -> s.getTo().equals(toCity))
                                .forEach(s -> {
                                    resultList.add(s);
                                    resultList.add(n);
                                });
                    }
                });

        Collections.reverse(resultList);
        return resultList;
    }

    public List<Fly> getThroughFly3Param(String fromCity, String toCity, String interCity) {
        List<Fly> result = flyRepository.getFlyList().stream()
                .filter(n -> n.getFrom().equals(fromCity) && n.getTo().equals(interCity) || n.getFrom().equals(interCity) && n.getTo().equals(toCity))
                .collect(Collectors.toList());

        if (result.size() < 2) {
            result.clear();
        }

        return result;
    }
}
