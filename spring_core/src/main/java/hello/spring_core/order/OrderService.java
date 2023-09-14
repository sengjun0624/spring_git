package hello.spring_core.order;

import hello.spring_core.order.Order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);

}
