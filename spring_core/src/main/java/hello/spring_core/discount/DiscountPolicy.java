package hello.spring_core.discount;

import hello.spring_core.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
