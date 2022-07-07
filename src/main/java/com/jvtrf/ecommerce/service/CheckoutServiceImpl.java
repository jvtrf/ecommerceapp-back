package com.jvtrf.ecommerce.service;

import com.jvtrf.ecommerce.dao.CustomerRepository;
import com.jvtrf.ecommerce.dto.Purchase;
import com.jvtrf.ecommerce.dto.PurchaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutServiceImpl implements CheckoutService{


    private CustomerRepository customerRepository;

    public  CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public PurchaseResponse placeOrder(Purchase purchase) {
        return null;
    }
}
