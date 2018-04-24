package com.kodilla.stream.reference;

public class FunctionalBeautifier {

    public static String beautifyConcat(String param) {
        return param.concat("AndHallow");
    }

    public static String beautifySubstring(String param) {
        return param.substring(2, 5);
    }

    public static String beautifyReplace(String param) {
        return param.replace("a", "v");
    }

    public static String beautifyTrim(String param) {
        return param.trim()+"Java";
    }
}
