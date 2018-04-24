package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"67032906720", "John", "Smith"},
            {"67032906721", "ivone", "Novak"},
            {"67032906722", "Jessie", "Pinkman"},
            {"67032906723", "Walter", "White"},
            {"67032906724", "Clara", "Lanson"}};

    private double[] salaries = {
            4500.00,
            3700.00,
            3400.00,
            8300.00,
            7900.00};

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
