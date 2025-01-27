package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);
    }

    // 마치 클래스에 직접 접근한 느낌? static 이 붙은 맴버 변수는 메서드 영역에서 관리한다.
    // 그러므로 static이 붙은 count는 인스턴스 영역에 생성되지 않는다.
}
