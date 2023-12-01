package hello.core.discount;

import hello.core.member.*;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercernt = 10;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPercernt / 100;
        } else {
            return 0;
        }
    }
}