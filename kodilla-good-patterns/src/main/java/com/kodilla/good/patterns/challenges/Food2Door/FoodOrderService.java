package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodOrderService {

    private static FoodInformationService foodInformationService;
    private  static ProductOrderService productOrderService;
    private static FoodOrderRepository foodOrderRepository;

    public FoodOrderService(final FoodInformationService informationService, final ProductOrderService productOrderService, final FoodOrderRepository foodOrderRepository) {
        this.foodInformationService = foodInformationService;
        this.productOrderService = productOrderService;
        this.foodOrderRepository = foodOrderRepository;
    }

    public FoodOrderDTO process(final FoodOrderRequest foodOrderRequest) {

        boolean isOrdered = productOrderService.rent(foodOrderRequest.getFoodCompany(), foodOrderRequest.getQuantity(),foodOrderRequest.getProductname());

        if (isOrdered) {
            foodInformationService.inform(foodOrderRequest.getFoodCompany());
            foodOrderRepository.createRental(foodOrderRequest.getFoodCompany(), foodOrderRequest.getQuantity(),foodOrderRequest.getProductname());
            return new FoodOrderDTO(foodOrderRequest.getFoodCompany(), true);
        } else {
            return new FoodOrderDTO(foodOrderRequest.getFoodCompany(), false);
        }
    }


    public static void main(String[] args) {

        FoodRequestRetriver foodRequestRetriver = new FoodRequestRetriver();
        FoodOrderRequest foodorderRequest = foodRequestRetriver.retrive();

        ProductOrderService productOrderService = new ProductOrderService(new FoodInformationServiceEmail(),new ProductOrderServicePotatos(),new FoodOrderRepositoryDataBase());

        productOrderService.process(foodorderRequest);
    }
}