/*package com.kodilla.exception.challenge;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderServiceService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final OrderService orderServiceService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderServiceService = orderServiceService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(),
                rentRequest.getTo());

        if(isRented) {
            informationService.inform(rentRequest.getUser());
            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }
*/