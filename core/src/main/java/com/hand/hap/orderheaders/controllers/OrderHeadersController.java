package com.hand.hap.orderheaders.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.orderheaders.dto.OrderHeaders;
import com.hand.hap.orderheaders.service.IOrderHeadersService;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class OrderHeadersController extends BaseController {

@Autowired
private IOrderHeadersService service;


@RequestMapping(value = "/headers/query")
@ResponseBody
public ResponseData query(OrderHeaders dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                          @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
    IRequest requestContext = createRequestContext(request);
    return new ResponseData(service.select(requestContext,dto,page,pageSize));
}

@RequestMapping(value = "/headers/submit")
@ResponseBody
public ResponseData update(@RequestBody OrderHeaders dto, HttpServletRequest request){
    /*输出*/
    System.out.println(dto);
    List<OrderHeaders> headers = new ArrayList<>();
    headers.add(dto);
    IRequest requestCtx = createRequestContext(request);
    return new ResponseData(service.batchUpdate(requestCtx, headers));
}

@RequestMapping(value = "/headers/remove")
@ResponseBody
public ResponseData delete(HttpServletRequest request, @RequestBody List<OrderHeaders> dto){
    service.batchDelete(dto);
    return new ResponseData();
}
    @RequestMapping(value = "/headers/update")
    @ResponseBody
    public ResponseData update2(@RequestBody OrderHeaders headers, HttpServletRequest request){
        /*输出*/
        if(headers!=null){
            System.out.println(headers.toString());
        }
        IRequest requestCtx = createRequestContext(request);
        OrderHeaders orderHeaders = service.updateByPrimaryKey(requestCtx, headers);
        return new ResponseData(true);
    }
}