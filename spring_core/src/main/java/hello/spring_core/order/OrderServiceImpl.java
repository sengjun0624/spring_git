package hello.spring_core.order;

import hello.spring_core.discount.DiscountPolicy;
import hello.spring_core.member.Member;
import hello.spring_core.member.MemberRepository;

public class OrderServiceImpl implements OrderService {
    private  final MemberRepository memberRepository;
    private  final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findByID(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
