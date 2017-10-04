package com.kodilla.exception.challenge;

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
        boolean isRented = orderService.rent(orderRequest.getUser(), orderRequest.getOrderitem());

        if(isRented) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createRental(orderRequest.getUser(), orderRequest.getOrderitem());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
