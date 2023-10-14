public class ConstructorsTypes {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Likitha Khatri");
        Student s3 = new Student(671);
    }
}

class Student {
    String name;
    int rollNo;

    // Non-Parameterized Constructor

    Student() {
        System.out.println("This is Non-parameterized Constructor");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int rollNo){
        this.rollNo = rollNo;
    }
}
