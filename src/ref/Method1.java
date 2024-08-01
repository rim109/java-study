package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student s, String name, int age, int grade){
        s.name = name;
        s.age = age;
        s.grade = grade;
    }

    static void printStudent(Student s) {
        System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적: " + s.grade);
    }
}
