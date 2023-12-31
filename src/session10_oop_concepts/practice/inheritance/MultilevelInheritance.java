package session10_oop_concepts.practice.inheritance;

public class MultilevelInheritance {
}

class Grandparent{
    void dance(){
        System.out.println("Grandpa should not dance");
    }
}

class Parent extends Grandparent{
    @Override
    void dance() {
        System.out.println("Parent can dance");
    }
}

class Child extends Parent{
    @Override
    void dance() {
        System.out.println("Child can dance too");
    }
}
