package com.ford.shoppersstop;

public class Purchase {
    private String customerName = null;
    private double discount;
    private double serviceCost;
    private double productCost;
    private Customer customerObj;
    private Discount discountObj;
    private double totalBill;

    public Purchase(Customer customer, Discount discount) {
        this.customerObj = customer;
        this.discountObj = discount;
    }


    public double getBill(String memType, double serviceCost, double productCost) {
        double serviceDiscountAmount = 0.00;
        double productDiscountamount = 0.00;
        if (!memType.equalsIgnoreCase("NOTAMEMBER")) {

            double serviceDisount = discountObj.getServiceDiscount(memType);
            double prodDisount = discountObj.getProductDiscount(memType);
            if (serviceDisount > 0)
                serviceDiscountAmount = serviceCost * serviceDisount;

            if (prodDisount > 0)
                productDiscountamount = productCost * prodDisount;
            totalBill = (serviceCost - serviceDiscountAmount) + (productCost - productDiscountamount);

        } else {
            System.out.println("Customer is NOT a Member...No Discount for YOU");
            totalBill = serviceCost + productCost;

        }
        System.out.println("Welcome to Shoppers Stop");
        System.out.println(customerObj.toString());
        System.out.println("Total Bill :" + totalBill);
        return totalBill;
    }

}
