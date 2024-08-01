package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "민지";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "하니";
        student2.age = 15;
        student2.grade = 90;

        Student[] students = {student1, student2};

        //1
        for (int i = 0; i < students.length; i++){
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }

        //2
        for (int i = 0; i < students.length; i++){
            Student s = students[i];
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

        //3
        for (Student s: students){
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

    }
}
