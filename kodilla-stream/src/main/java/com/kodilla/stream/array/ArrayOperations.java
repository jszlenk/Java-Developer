package com.kodilla.stream.array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(i -> i = numbers[i])
                .forEach(System.out::println);

        List result = IntStream.range(0, numbers.length)
                .mapToObj(i -> i = numbers[i])
                .collect(Collectors.toList());
        System.out.println("List : " + result);

        int sum = IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .sum();
        System.out.println("Sum: " + sum);

        double avg = IntStream.range(0, numbers.length)
                .map(i -> i = numbers[i])
                .average()
                .getAsDouble();
        System.out.println("Average: " + avg);

        return avg;
    }
}
