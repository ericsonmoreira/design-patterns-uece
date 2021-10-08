package com.uece.strategy;

public class Employee {
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void handlePrint() throws Exception {
        PrintStrategy printStrategy;
        switch (this.location) {
            case RH:
                printStrategy = new RHPrintStrategy();
                break;
            case Info:
                printStrategy = new InfoPrintStrategy();
                break;
            case Marketing:
                printStrategy = new MarketingPrintStrategy();
                break;
            default:
                throw new Exception("Employee Location not defined");
        }
        printStrategy.print();
    }
}
