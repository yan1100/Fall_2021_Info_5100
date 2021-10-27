package com.company;

import jdk.jfr.Category;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        Fiction fiction1 = new Fiction("Fiction Book", 20.99,"2000");
        System.out.println(fiction1.description());
        fiction1.setBorrowDate(2);
        fiction1.setReturnDate(5);
        System.out.println(fiction1.isAvailable(3));
        System.out.println(fiction1.isAvailable(6));
        Reference reference1 = new Reference("Fiction Book",20.99,"2000","Fiction");
        System.out.println(reference1.description());
    }

    public static abstract class Book {
        private String title;
        private Double price;
        private String publishYear;

        public Book(String title, Double price, String publishYear) {
            this.title = title;
            this.price = price;
            this.publishYear = publishYear;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public String getPublishYear() {
            return publishYear;
        }

        public void setPublishYear(String publishYear) {
            this.publishYear = publishYear;
        }

        public abstract String description();
    }

    public interface iBorrowable {
        void setBorrowDate(int day);
        void setReturnDate(int day);
        boolean isAvailable(int day);
    }

    public static class Fiction extends Book implements iBorrowable {
        int borrowDate;
        int returnDate;

        public Fiction(String title, Double price, String publishYear) {
            super(title, price, publishYear);
        }

        @Override
        public String description() {
            return getTitle() + " all events are imaginary and not based on real facts.";
        }

        @Override
        public void setBorrowDate(int day) {
            borrowDate = day;
        }

        @Override
        public void setReturnDate(int day) {
            if (day >= borrowDate) {
                returnDate = day;
            }else {
                System.out.println("Invalid return date");
            }
        }

        @Override
        public boolean isAvailable(int day) {
            if (day >= borrowDate && day <= returnDate) {
                return false;
            }else {
                return true;
            }
        }
    }

    public static class NonFiction extends Book implements iBorrowable {
        private int borrowDate;
        private int returnDate;

        public NonFiction(String title, Double price, String publishYear) {
            super(title, price, publishYear);
        }

        @Override
        public String description() {
            return getTitle() + " all events are true and based on real facts.";
        }

        @Override
        public void setBorrowDate(int day) {
            borrowDate = day;
        }

        @Override
        public void setReturnDate(int day) {
            if (returnDate >= borrowDate) {
                returnDate = day;
            }else {
                System.out.println("Invalid return date");
            }
        }

        @Override
        public boolean isAvailable(int day) {
            if (day >= borrowDate && day <= returnDate) {
                return false;
            }else {
                return true;
            }
        }
    }

    public static class Reference extends Book {
        String category;

        public Reference(String title, Double price, String publishYear, String category) {
            super(title, price, publishYear);
            this.category = category;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        @Override
        public String description() {
            return getTitle() + " all information is real";
        }
    }
}
