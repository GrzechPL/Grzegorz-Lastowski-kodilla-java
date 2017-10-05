package com.kodilla.good.patterns.challenges.challenge;

public class ProductOrderService {

    private static InformationService informationService;
    private  static OrderService orderService;
    private static OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
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


    public static void main(String[] args) {

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = OrderRequestRetriver.retrive();

        ProductOrderService productOrderService = new ProductOrderService(new InformationServiceEmail(),new OrderServicePcGames(),new         OrderRepositoryDataBase());
        productOrderService.process(orderRequest);
    }
}