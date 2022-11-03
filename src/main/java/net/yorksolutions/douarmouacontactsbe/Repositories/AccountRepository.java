package net.yorksolutions.douarmouacontactsbe.Repositories;

import net.yorksolutions.douarmouacontactsbe.DTOs.NewAccountRequestDTO;
import net.yorksolutions.douarmouacontactsbe.Entities.Account;
import net.yorksolutions.douarmouacontactsbe.Services.AccountService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    public Optional<Account> findAccountByUsernameAndPassword(String username, String password);
}
