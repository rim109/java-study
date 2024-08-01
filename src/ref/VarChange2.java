package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.value = 10;
        Data data2 = new Data();

        System.out.println("data1 참조값 = " + data1);
        System.out.println("data2 참조값 = " + data2);
        System.out.println("data1.value = " + data1.value);
        System.out.println("data2.value = " + data2.value);

        //data1 변경
        data1.value = 20;
        System.out.println("data1.value 변경 a = 20");
        System.out.println("data1.value = " + data1.value);
        System.out.println("data2.value = " + data2.value);

        // data2 변경
        data2.value = 30;
        System.out.println("data2.value 변경 b = 30");
        System.out.println("data1.value = " + data1.value);
        System.out.println("data2.value = " + data2.value);
    }
}
