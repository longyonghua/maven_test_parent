package com.longge.controller;

import com.longge.domain.Account;
import com.longge.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author longge
 * @create 2019-10-15 上午10:41
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService service;

    @RequestMapping("/findById/{id}")
    public String findById(@PathVariable("id") Integer id, Model model){
        Account account = service.findById(id);
        model.addAttribute("account",account);
        return "list";
    }

}
