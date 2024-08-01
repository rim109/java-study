package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생1";
        student2.age = 15;
        student2.grade = 90;

        Student[] students = new Student[2];
        // 참조값이 없으면 null 값으로 초기화 된다.
        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.
        // 주의! 변수에는 인스턴스 자체가 들어 있는 것이 아니라 인스턴스 위치를 가르키는 참조값이 들어가있는 것이므로 대입 시에 인스턴수가 복사되는 것이 아닌 참조값이 복사되는 것이다.
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);
    }
}
