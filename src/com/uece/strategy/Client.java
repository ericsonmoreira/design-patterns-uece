package com.uece.strategy;

public class Client {
    public static void main(String[] args) {

        Employee employee = new Employee();

        try {
            employee.setLocation(Location.RH);
            employee.handlePrint();
            employee.setLocation(Location.Info);
            employee.handlePrint();
            employee.setLocation(Location.Marketing);
            employee.handlePrint();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
