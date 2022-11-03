package net.yorksolutions.douarmouacontactsbe.Services;

import net.yorksolutions.douarmouacontactsbe.Repositories.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
}
