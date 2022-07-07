package com.jvtrf.ecommerce.service;

import com.jvtrf.ecommerce.dto.Purchase;
import com.jvtrf.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
