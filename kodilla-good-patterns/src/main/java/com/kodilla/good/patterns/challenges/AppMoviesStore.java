package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AppMoviesStore {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> title = movieStore.getMovies();

        title.entrySet().stream()
                .flatMap(a -> a.getValue().stream())
                .forEach(s -> System.out.println(s + "!"));

        String allTitle = title.entrySet().stream()
                .flatMap(a -> a.getValue().stream())
                .collect(Collectors.joining("! "));

        System.out.println(allTitle);
    }
}
