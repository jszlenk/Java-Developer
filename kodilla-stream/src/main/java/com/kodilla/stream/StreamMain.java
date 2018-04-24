package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalBeautifier;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        BookDirectory theBookDirectory = new BookDirectory();
        Forum theForum = new Forum();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("String expressions with lambdas");
        poemBeautifier.beautify("java", (a) -> "Oracle " + a.toUpperCase());
        poemBeautifier.beautify("Hallow", (a) -> a + " CODERS".toLowerCase());
        poemBeautifier.beautify("ABC", (a) -> String.valueOf(a.contains("A")));
        poemBeautifier.beautify("Hollywood", (a) -> String.valueOf(a.indexOf('l')));
        poemBeautifier.beautify("Armageddon", (a) -> String.valueOf(a.charAt(0)));
        poemBeautifier.beautify("-", (a) -> String.join(a, "Hallow, welcome", "to", "java"));

        System.out.println("Reference string expressions with lambdas");
        poemBeautifier.beautify("Hallow", FunctionalBeautifier::beautifyConcat);
        poemBeautifier.beautify("Hallow", FunctionalBeautifier::beautifyReplace);
        poemBeautifier.beautify("Hallow", FunctionalBeautifier::beautifySubstring);
        poemBeautifier.beautify("HallowToMyCode ", FunctionalBeautifier::beautifyTrim);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);


        Map<Integer, ForumUser> theResultMapOfForumUser = theForum.getUserList().stream()
                .filter(username -> username.getGender() == 'M')
                .filter(username -> username.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(username -> username.getQuantitypost() > 1)
                .collect(Collectors.toMap(ForumUser::getId, username -> username));

        System.out.println("# elements: " + theResultMapOfForumUser.size());
        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}