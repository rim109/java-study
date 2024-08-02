package pack;

import pack.a.User;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        pack.b.User user1 = new pack.b.User();
    }
}

// 같은 페이지면 import 안해도 된다.
// 같은 이름이라면 하나는 저렇게 적어줘야 한다.