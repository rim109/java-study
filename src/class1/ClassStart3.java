package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        // 변수 선언
        student1 = new Student();
        // 인스턴스(new -> 실제 메모리에 만들어진 실체 또는 객체) 형성, 아래의 student2와는 메모리 주소가 다르기 때문에 == 할 경우 false가 나온다.
        // 참조값 반환 -> 메모리 어딘가에 저장되어 있는 인스턴스틑 객체를 접근하고 참조할 수 있다.
        student1.name = "은석";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "원빈";
        student2.age = 15;
        student2.grade = 90;

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}
