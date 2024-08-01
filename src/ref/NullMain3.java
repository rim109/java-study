package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData data = new BigData();
        System.out.println(data.data); // null
        System.out.println(data.count); // 0
        System.out.println(data.data.value); //null.value 이므로 NullPointerException 발생

        // 그래서
        //Date d = new Date();를 생성해주면 된다.
    }
}
