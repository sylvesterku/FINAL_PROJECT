package com.sda.steelprofiles.finalApp.controllers;

import com.sda.steelprofiles.finalApp.dtos.CsectionDTO;
import com.sda.steelprofiles.finalApp.dtos.OrderDTO;
import com.sda.steelprofiles.finalApp.dtos.OrderProductDTO;
import com.sda.steelprofiles.finalApp.entities.OrderProduct;
import com.sda.steelprofiles.finalApp.services.servicesImpl.CsectionServiceImpl;
import com.sda.steelprofiles.finalApp.services.servicesImpl.OrderProductServiceImpl;
import com.sda.steelprofiles.finalApp.services.servicesImpl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CsectionController {

    private CsectionServiceImpl csection;
    private OrderServiceImpl order;
    private OrderProductServiceImpl orderProductService;

    @Autowired
    public CsectionController(CsectionServiceImpl csection, OrderServiceImpl order, OrderProductServiceImpl orderProductService) {
        this.csection = csection;
        this.order = order;
        this.orderProductService = orderProductService;
    }

    @GetMapping("/addCsection")
    public String showaddingForm(Model model) {
        model.addAttribute("allProfiles", csection.findAll());
        model.addAttribute("allOrders", order.findAll());
        model.addAttribute("newCsection", new CsectionDTO());
        model.addAttribute("newOrderPosition", new CSectionFormDTO());
        model.addAttribute("queryString", new QueryString());
        model.addAttribute("newOrderCreate", new OrderDTO());
        model.addAttribute("newProduct", new OrderProductDTO());
        return "addCsection";
    }


    @PostMapping("/addNewCsectionAction")
    public String addNewCsection(@ModelAttribute("newCsection") CsectionDTO csectionDTO) {
        if (csection.findByName(csectionDTO.getName()) == null) {
            csection.save(csectionDTO);
        } else {
            csection.update(csectionDTO);
        }
        return "redirect:addCsection";
    }

    @GetMapping("/createNewOrderAction")
    public String create(@ModelAttribute("newOrderCreate") OrderDTO orderDTO) {
        order.create(orderDTO);
        return "redirect:addCsection";
    }

    @PostMapping("/addProductToOrder")
    public String addProductsToOrder(@ModelAttribute("newProduct") OrderProductDTO orderProductDTO) {
        orderProductService.create(orderProductDTO);
        return "redirect:addCsection";
    }
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

    public static class CSectionFormDTO{
        private int productId;
        private int quantity;

        public CSectionFormDTO() { }

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}