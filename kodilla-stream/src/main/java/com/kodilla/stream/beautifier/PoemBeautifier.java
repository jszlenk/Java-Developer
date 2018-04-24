package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String param, PoemDecorator poemDecorator) {
        System.out.println("Result new String : " + poemDecorator.decorate(param));
    }
}
