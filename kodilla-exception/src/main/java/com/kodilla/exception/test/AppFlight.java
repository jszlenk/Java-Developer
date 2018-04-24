package com.kodilla.exception.test;

public class AppFlight {
    public static void main(String[] args) {
        SearchFilght searchFilght = new SearchFilght();
        try {
            searchFilght.findFilght(new Flight("Gdansk", "Krakow"));
            searchFilght.findFilght(new Flight("Warsow", "Krakow"));
            searchFilght.findFilght(new Flight("Berlin", "Krakow"));
        } catch (RouteNotFoundException e) {
            System.out.println("There is no city name. Error: " + e);
        } finally {
            System.out.println("End");
        }
    }
}
