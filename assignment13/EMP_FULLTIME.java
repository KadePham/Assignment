package assignment13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class EMP_FULLTIME extends EMPLOYEE{
    private double coefficientSalary;

    public double getCoefficientSalary() {
        return coefficientSalary;
    }

    public void setCoefficientSalary(double coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }
    
    public void update (String emId) {
        try {
            Scanner scanner = new Scanner(System.in);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
            System.out.println("|Update EMPLOYEE information|");
            setEmId(emId);
            System.out.print("Name = "); setEmName(scanner.nextLine());
            System.out.print("Date_Of_Birth = "); setEmDateOfBirth(formatter.parse(scanner.nextLine()));
            System.out.print("Start_Date = "); setStartDate(formatter.parse(scanner.nextLine()));
            System.out.print("Coefficients Salary = "); setCoefficientSalary(Double.parseDouble(scanner.nextLine()));
        } catch (ParseException ex) {
            System.out.println("Error !!!");
        }
    }
    
    @Override
    public void input() {
        try {
            Scanner scanner = new Scanner(System.in);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
            System.out.println("|Enter EMPLOYEE information|");
            System.out.print("ID = "); setEmId(scanner.nextLine());
            System.out.print("Name = "); setEmName(scanner.nextLine());
            System.out.print("Date_Of_Birth = "); setEmDateOfBirth(formatter.parse(scanner.nextLine()));
            System.out.print("Start_Date = "); setStartDate(formatter.parse(scanner.nextLine()));
            System.out.print("Coefficients Salary = "); setCoefficientSalary(Double.parseDouble(scanner.nextLine()));
        } catch (ParseException ex) {
            System.out.println("Error !!!");
        }
    }

    @Override
    public void output() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println("EMPLOYEE { ID = " + getEmId() + ", Name = " + getEmName()
                            + ", Date_Of_Birth = " + formatter.format(getEmDateOfBirth()) + ", Start_Date = " + formatter.format(getStartDate())
                            + ", Coefficients Salary = " + getCoefficientSalary() + " }");
    }
    
    @Override
    public int calculateSeniority() {
        int thisYear = LocalDate.now().getYear();
        int startYear = getStartDate().getYear() + 1900;
        return (thisYear - startYear);
    }

    @Override
    public double CalculateSalary() {
        return BASIC_SALARY * getCoefficientSalary() + CalculateAllowance();
    }

    @Override
    public double CalculateAllowance() {
        if (calculateSeniority() >= 10) {
            return 1000000;
        }
        else if (calculateSeniority() <= 10) {
            return 500000;
        }
        return 0;
    }
}