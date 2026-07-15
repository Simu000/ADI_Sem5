
abstract class Student {
    void name() {
        System.out.println("Name is Harsimrat");
    }

    abstract void Department();
}

class ScienceStudent extends Student {
    void Department() {
        System.out.println("Department is Computer Science");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        ScienceStudent student = new ScienceStudent();
        student.name();
        student.Department();
    }
}