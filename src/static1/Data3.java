package static1;

public class Data3 {
    public String name;
    public static int count; // static

    public Data3(String name){
        this.name = name;
        count++;
    }

    // 특정 클래스에서 공용으로 함께 사용할 수 있는 변수를 만들 수 있다면 편리할 것인다. static 키워드를 사용하면 공용으로 함께 사용하는 변수를 만들 수 있다.
}
