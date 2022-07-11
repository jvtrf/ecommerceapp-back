package com.jvtrf.ecommerce.dto;

import com.jvtrf.ecommerce.entity.Address;
import com.jvtrf.ecommerce.entity.Customer;
import com.jvtrf.ecommerce.entity.Order;
import com.jvtrf.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
