package com.ford.shoppersstop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PurchaseTest {
    Customer customer;
    Purchase purchase;
    Discount discount;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Harry", "SILVER");
        discount = new Discount();
        purchase = new Purchase(customer, discount);

    }

    @Test
    public void getBill_ifcustomerIsPlatinumMemberAndServiceCostIs1000andProductCostIs500_totalAmount() {
        assertEquals(1295, purchase.getBill(customer.getMemberType(), 1000.00, 500.00), 0);

    }

    @Test
    public void getBill_ifcustomerIsDiamondMemberAndServiceCostIs700andNoProductCost_totalAmount() {

        assertEquals(581.0, purchase.getBill(customer.getMemberType(), 700.00, 0), 0);
    }

    @Test
    public void getBill_ifcustomerIsNotAMemberAndServiceCostIs500_totalAmount500() {

        assertEquals(500, purchase.getBill(customer.getMemberType(), 500.00, 0), 0);
    }

    @Test
    public void getBill_ifcustomerIsAMemberAndServiceCostIs0andProductCostIs700_totalAmount() {

        assertEquals(595, purchase.getBill(customer.getMemberType(), 0, 700.00), 0);
    }

    @Test
    public void getBill_ifcustomerIsADiffMemberAndServiceCostIs0andProductCostIs700_totalAmount() {

        assertEquals(700, purchase.getBill(customer.getMemberType(), 0, 700.00), 0);
    }
}