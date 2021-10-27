package com.company;

class Printer {

    private Printer() {
    }
    public static Printer getInstance() {
        return new Printer();
    }
    public void getConnection() {
        System.out.println(" Your Printer is working");
    }
    }
    class Main {
        public static void main(String[] args) {
            Printer p1;
            // refers to the only object of Database
            p1= Printer.getInstance();

            p1.getConnection();
        }
    }
