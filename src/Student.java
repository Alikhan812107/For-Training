class Student extends Person {
    String university;

    Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    void introduce() {
        System.out.println("Name is " + name + ", age is " + age);
    }

}
