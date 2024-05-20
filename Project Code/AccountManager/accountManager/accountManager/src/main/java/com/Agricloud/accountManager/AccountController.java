package com.Agricloud.accountManager;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController{

    private AccountService accountService = new AccountService();
    
    @GetMapping(path = "{username}")
    public Account getAccount(@PathVariable("username")String username){
        return accountService.getAccount(username.trim().toLowerCase());
    }

    @PostMapping
    public Account addAccount(@RequestBody Account account){
        return accountService.addAccount(account);
    }

    @PutMapping(path = "{username}")
    public Account updateAccount(@PathVariable("username")String username, @RequestBody Account account){
        account.setUsername(username.trim().toLowerCase());
        return accountService.updateAccount(account);
    }

    @DeleteMapping(path = "{username}")
    public String deleteAccount(@PathVariable("username")String username){
        return accountService.deleteAccount(username.trim().toLowerCase());
    }
}