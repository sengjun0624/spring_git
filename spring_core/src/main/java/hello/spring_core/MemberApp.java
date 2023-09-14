package hello.spring_core;

import hello.spring_core.member.*;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new AppConfig().memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }

}
