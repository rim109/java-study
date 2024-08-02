package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name = " + name  + ",age =" + age + ", grade =" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 생성자는 메서드와 비슷하지만 차이점이 있다.
    // 1. 생성자의 이름은 클래스 이름과 같아야 하고 그래서 첫글자가 대문자여야 한다.
    // 2. 생성자는 반환타입이 없으므로 비워둬야 한다.

    // 생성자의 장점
    // 1. 생성자가 없을 때는 생성 직후에 어떤 ㅈ가업을 수행하기 위해 메서드를 직접 한번 더 호출해야했다.. 하지만
    // 생성자 덕분에 객체를 생성하면서 동시에 생성 직후에 필요한 작업을 한 번에 처리할 수 있게 되었다... 즉, 중복 호출을 제거해준다.
    // 2. 데이터가 소실 될 경우에도 코드 상 문제가 없으므로 컴파일은 되지만 아무 정보가 없는 데이터가 만들어지게 된다.
    // 하지만 생성자를 쓰면, 매개변수를 넣어주지 않으면 에러가 발생한다. 직접 정의한 생성자를 반드시 호출해야한다.
    // 정리: 생성자를 사용하면 필수값 입력을 보장할 수 있다.
}
