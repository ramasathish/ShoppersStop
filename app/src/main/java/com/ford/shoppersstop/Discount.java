package com.ford.shoppersstop;

public class Discount {
    public final double diamondServiceDiscount = 0.17;
    public final double platinumServiceDiscount = 0.13;
    public final double goldServiceDiscount = 0.09;
    public final double productDiscount = 0.15;





    public double getServiceDiscount(String memberType) {
        double discountAmount = 0.00;
        if (memberType.equalsIgnoreCase("diamond")) discountAmount = diamondServiceDiscount ;
        else if (memberType.equalsIgnoreCase("platinum")) discountAmount = platinumServiceDiscount;
        else if (memberType.equalsIgnoreCase("gold")) discountAmount = goldServiceDiscount;
        return discountAmount;

    }

    public Double getProductDiscount(String memberType) {
        double discountAmount = 0.00;
        if (memberType.equalsIgnoreCase("diamond")
                || memberType.equalsIgnoreCase("platinum")
                || memberType.equalsIgnoreCase("gold")
                || memberType.equalsIgnoreCase("")) discountAmount = productDiscount;
        else
            return discountAmount;
        return discountAmount;
    }


}
