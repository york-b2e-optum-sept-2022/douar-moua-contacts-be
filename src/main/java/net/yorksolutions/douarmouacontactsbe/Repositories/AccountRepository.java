package net.yorksolutions.douarmouacontactsbe.Repositories;

import net.yorksolutions.douarmouacontactsbe.Entities.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
}
