package com.hand.hap.orderheaders.service.impl;

import com.hand.hap.orderheaders.dto.OrderHeaders;
import com.hand.hap.orderheaders.service.IOrderHeadersService;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class OrderHeadersServiceImpl extends BaseServiceImpl<OrderHeaders> implements IOrderHeadersService{

}