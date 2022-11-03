package net.yorksolutions.douarmouacontactsbe.Controllers;

import net.yorksolutions.douarmouacontactsbe.DTOs.NewAccountRequestDTO;
import net.yorksolutions.douarmouacontactsbe.Entities.Account;
import net.yorksolutions.douarmouacontactsbe.Services.AccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public Account createAccount(@RequestBody NewAccountRequestDTO requestDTO){
        return this.accountService.createAccount(requestDTO);
    }
}
