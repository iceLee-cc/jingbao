package com.iflytek.controller;

import com.iflytek.domain.Order;
import com.iflytek.domain.User;
import com.iflytek.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/order")
    public String SelectAllOrder(Model model){
        List<Order> list=orderService.selectAllOrder();
        System.out.println(list);
        model.addAttribute("list",list);
        return  "showAllOrder";
    }

}
