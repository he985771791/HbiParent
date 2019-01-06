package com.hand.hap.orderlines.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.orderlines.dto.OrderLines;
import com.hand.hap.system.service.IBaseService;

public interface IOrderLinesService extends IBaseService<OrderLines>, ProxySelf<IOrderLinesService> {

}