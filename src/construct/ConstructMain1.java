package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("1", 15,90);

        MemberConstruct member2 = new MemberConstruct("2", 16,80);

        MemberConstruct member3 = new MemberConstruct("3", 50);

        MemberConstruct[] members = {member1, member2, member3};

        for (MemberConstruct member : members) {
            System.out.println("이름:" + member.name + "나이: " + member.age + "성적: " + member.grade);
        }
    }
}
