package com.iflytek.service.impl;

import com.iflytek.dao.OrderDao;
import com.iflytek.domain.Order;
import com.iflytek.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
   @Autowired
   OrderDao orderDao;
   @Override
   public List<Order> selectAllOrder() {
        return orderDao.selectAllOrder();
   }
}
