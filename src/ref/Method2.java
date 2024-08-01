package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);

        Student student2 = createStudent("학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade){
        Student s = new Student();
        s.name = name;
        s.age = age;
        s.grade = grade;
        return s;
    }

    static void printStudent(Student s) {
        System.out.println("이름 : " + s.name + " 나이 : " + s.age + " 성적: " + s.grade);
    }
}
