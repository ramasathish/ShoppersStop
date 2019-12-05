package com.ford.shoppersstop;

public class Customer {
    private Discount discount;


    private String name = null;

    public String getName() {
        return name;
    }

    public String getMemberType() {
        return memberType;
    }

    private String memberType = null;

    public Customer(String name, String memberType) {
        this.name = name;
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer" +
                "name='" + name + '\'' +
                ", memberType='" + memberType + '\'';
    }


}
