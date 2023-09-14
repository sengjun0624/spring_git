package hello.spring_core.discount;

import hello.spring_core.member.Grade;
import hello.spring_core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {
    private int discountFixamout=1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixamout;
        }else{
            return 0;
        }
    }
}
