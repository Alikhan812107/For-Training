public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static void SayHello(Person p) {
        System.out.println("Hi, My name is " + p.name + ", I am " + p.age + " years old");
    }

}




