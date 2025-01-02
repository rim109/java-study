package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1(){
        System.out.println("method1 start");
        Data data1 = new Data(10); // 힙 영역 -> 객체 생성(인스턴스) // 힙 영역 외부가 아닌 영역 안에서만 인스턴스 서로
        // 참조가능 -> 이는 GC의 대상이 된다.
        method2(data1);
        System.out.println("method1 end");
    }

    static void method2(Data data2){
        System.out.println("method2 start");
        System.out.println("data.value =" + data2.getValue());
        System.out.println("method2 end");
    }

    // 스택 구조
    // main -> method1 -> method2 -> method2 -> method1 -> main
    // 더 사용하지 않는 객체는 메모리 차지만 하는데,,
    //GC는 이렇게 참조가 모두 사라진 인스턴스를 찾아서 메모리에서 제거한다.
    // 지역 변수는 스택 영역에, 객체는 힙 영역에...
}
