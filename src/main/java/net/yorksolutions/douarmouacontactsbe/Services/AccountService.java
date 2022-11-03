package net.yorksolutions.douarmouacontactsbe.Services;

import net.yorksolutions.douarmouacontactsbe.DTOs.NewAccountRequestDTO;
import net.yorksolutions.douarmouacontactsbe.Entities.Account;
import net.yorksolutions.douarmouacontactsbe.Repositories.AccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account createAccount(NewAccountRequestDTO requestDTO){
        try {
            return this.accountRepository.save(new Account(requestDTO.username, requestDTO.password));
        } catch (RuntimeException e){
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
    }

    public Account loginAccount(NewAccountRequestDTO requestDTO){
        Optional<Account> accountOptional = this.accountRepository.findAccountByUsernameAndPassword(requestDTO.username, requestDTO.password);
        if (accountOptional.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return accountOptional.get();
    }
}
