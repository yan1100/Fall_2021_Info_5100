package com.company;

public class Q1 {
    public static void main(String[] args) {
        HappyObject happyObject = new HappyObject();
        SadObject sadObject = new SadObject();
        Psychiatrist psychiatrist = new Psychiatrist();
        //happy object
        psychiatrist.examine(happyObject);
        System.out.println(" ");
        psychiatrist.observe(happyObject);
        System.out.println("Observation: " + psychiatrist.toString(happyObject));
        System.out.println(" ");
        //sad object
        psychiatrist.examine(sadObject);
        System.out.println(" ");
        psychiatrist.observe(sadObject);
        System.out.println("Observation: " + psychiatrist.toString(sadObject));
    }

    public static abstract class MoodyObject {
        public MoodyObject() {
        }

        abstract String getMood();
        abstract void expressFeelings();

        public void queryMood() {
            System.out.println("I feel " + getMood() + " today");

        };


    }

    public static class SadObject extends MoodyObject {
        @Override
        String getMood() {
            return "sad";
        }

        @Override
        void expressFeelings() {
            System.out.println("waah’  ‘boo hoo’  ‘weep’ ‘sob");
        }

        @Override
        public String toString() {
            return "Subject cries a lot";
        }

    }

    public static class HappyObject extends MoodyObject {
        @Override
        String getMood() {
            return "happy";
        }

        @Override
        void expressFeelings() {
            System.out.println("heeehee....hahahah...HAHAHA!!");
        }

        @Override
        public String toString() {
            return "Subject laughs a lot";
        }
    }

    public static class Psychiatrist {
        public void examine(MoodyObject moodyObject) {
            System.out.println("How are you feeling today?");
            moodyObject.queryMood();

        };
        public void observe(MoodyObject moodyObject){
            moodyObject.expressFeelings();
        };

        public String toString(MoodyObject moodyObject) {
           return moodyObject.toString();
        }
    }
}
