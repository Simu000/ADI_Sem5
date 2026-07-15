
interface Student {
    void name();

    void Department();
}

class ScienceStudent implements Student {
    public void name() {
        System.out.println("Name is Harsimrat");
    }

    public void Department() {
        System.out.println("Department is Computer Science");
    }
}

public class InterfaceCode {
    public static void main(String[] args) {
        Student student = new ScienceStudent();
        student.name();
        student.Department();
    }

}
