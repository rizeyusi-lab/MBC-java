package d2.p65;

public class RunningAnimal {
    public static void main(String[] args) {
        Animal anil = new Animal();
        anil.name = "cat";
        anil.age = 10;

        System.out.println(anil.name);
        System.out.println(anil.age);
    }
}


class Animal {
    String name;
    int age;
}