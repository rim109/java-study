package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"우진","제덕","우석"};
        int[] studentAges = {15, 16, 17};
        int [] studentGrades = {90, 80, 80};

        for (int i = 0; i < studentNames.length; i++){
            System.out.println("이름:" + studentNames[i] + "나이:" + studentAges[i] + "성적:" + studentGrades[i]);
        }
    }
}
