package daffanaufal.application;

import daffanaufal.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Universitas Budi Luhur");

        Company.Employee employee = company.new Employee();
        employee.setName("Daffa");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Not Found");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Gugul");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());

    }
}
