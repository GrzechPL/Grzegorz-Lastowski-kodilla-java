package com.kodilla.good.patterns.challenges.challenge;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final OrderService orderServiceService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderServiceService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {

        boolean isOrdered = orderService.rent(orderRequest.getUser(), orderRequest.getOrderitem());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createRental(orderRequest.getUser(), orderRequest.getOrderitem());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
