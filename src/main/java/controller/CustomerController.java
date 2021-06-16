package controller;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerServiceORM;
import service.ICustomerService;

import java.util.List;

@Controller

public class CustomerController {
    //CustomerServiceORM serviceORM = new CustomerServiceORM();
    @Autowired
    private ICustomerService customerService;

    @GetMapping("")
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("home");
        List<Customer> customerList = customerService.findAll();
        mav.addObject("customers", customerList);
        return mav;
    }



    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView mav = new ModelAndView("create");
        mav.addObject("customer", new Customer());
        return mav;
    }
    @PostMapping("/create")
    public  String create(Customer customer){
        // viet phuong thuc ađ ơ day
//        CustomerServiceORM customerServiceORM = new CustomerServiceORM();
//        customerServiceORM.findAll();
        return "redirect:/";
    }


}

