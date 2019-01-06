package com.hand.hap.customers.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.customers.dto.Customers;
import com.hand.hap.system.service.IBaseService;

public interface ICustomersService extends IBaseService<Customers>, ProxySelf<ICustomersService> {

}