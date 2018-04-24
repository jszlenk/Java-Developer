package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchHibernateFacadeTestsSuite {
    @Autowired
    SearchFasade searchFasade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Before
    public void createData() {
        Employee employee = new Employee("Kuba", "Kubicki");
        Company company = new Company("Nike");
        employee.getCompanies().add(company);
        company.getEmployees().add(employee);
        employeeDao.save(employee);
    }

    @Test
    public void testSearchCompanyFacade() throws SearchException {

        String searchPhraseC = "Nike";

        try {
            searchFasade.processSearchCompany(searchPhraseC);
        } catch (SearchException e) {
            // business exception
        }
    }

    @Test
    public void testSearchEmployeeFacade() throws SearchException {

        String searchPhraseE = "Kuba";

        try {
            searchFasade.processSearchEmployee(searchPhraseE);
        } catch (SearchException e) {
            // business exception
        }
    }
}
