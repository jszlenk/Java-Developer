package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SalaryAdapterTestSuite {
    @Test
    public void testTotalSalry() {
        //Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdpter = new SalaryAdapter();
        //When
        double totalSalary = salaryAdpter.TotalSalary(workers.getWorkers(), workers.getSalaries());
        //Then
        System.out.println(totalSalary);
        assertEquals(totalSalary, 27800, 0);
    }
}
