public class CopyConstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Likitha Khatri";
        s1.rollNo = 456;
        s1.password = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 70;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s2.marks[2] = 80;

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int rollNo;
    String password;
    int marks[];

    // copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        this.marks = s1.marks;
    }

    Student(){
        marks = new int[3];
        System.out.println("This is Copy constructor");
    }
}
