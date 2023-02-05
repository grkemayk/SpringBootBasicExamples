package com.DependencyInjection;

public class Main {
    public static void main(String[] args) {
        Automative bmw = new Automative(new BMW());
        bmw.drive();
        Automative mercedes = new Automative(new Mercedes());
        mercedes.drive();
    }

    interface Skill {
        void drive();
    }
    static class Automative implements Skill{
        Skill skill;
        public Automative(Skill skill) {
            this.skill = skill;
        }

        @Override
        public void drive() {
            skill.drive();
        }
    }
    static class BMW implements Skill {

        @Override
        public void drive() {
            System.out.println("BMW Skill");
        }
    }
    static class  Mercedes implements Skill {

        @Override
        public void drive() {
            System.out.println("Mercedes Skill");
        }
    }
}
