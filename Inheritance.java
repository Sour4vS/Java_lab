public class Inheritance {
    public static void main(String[] args) {
    Person person = new Person("sourav",19);
    person.displayInfo();
    }
}
class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.println("name "+this.name);
        System.out.println("age "+this.age);
    }
}
    class student extends Person{
    String studentId;
    student(String name, String studentId, int age){
        super(name, age);
        this.studentId = studentId;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("student id "+this.studentId);
    }
    }
