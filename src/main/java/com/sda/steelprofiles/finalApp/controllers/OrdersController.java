package com.sda.steelprofiles.finalApp.controllers;

import com.sda.steelprofiles.finalApp.services.servicesImpl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrdersController {

    private OrderServiceImpl orders;

    @Autowired
    public OrdersController(OrderServiceImpl orders) {
        this.orders = orders;
    }

//    @GetMapping("/addCsection")
//    public String showaddingForm(Model model) {
//        model.addAttribute("allOrders", orders.findAll());
//        model.addAttribute("newOrder", new OrderDTO());
//        model.addAttribute("queryString", new QueryString());
//        return "addCsection";
//    }


//    @PostMapping("/addNewOrderAction")
//    public String addNewOrder(@ModelAttribute("newOrder") OrderDTO ordersDTO) {
//        if (ordersDTO.getName().equals(orders.findByName(ordersDTO.getName()))) {
//            orders.update(ordersDTO);
//        } else {
//            orders.save(ordersDTO);
//        }
//
//        return "redirect:addCsection";
//    }
    public static class QueryString{
        String queryString;

        public QueryString() {
        }

        public QueryString(String queryString) {
            this.queryString = queryString;
        }

        public String getQueryString() {
            return queryString;
        }

        public void setQueryString(String queryString) {
            this.queryString = queryString;
        }
    }
}