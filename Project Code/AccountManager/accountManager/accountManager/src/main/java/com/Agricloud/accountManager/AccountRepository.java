package com.Agricloud.accountManager;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AccountRepository extends JpaRepository<Account,Integer> {

	
	 @Query("SELECT a FROM Account a where a.username=:username")
	 Account getbyUName(@Param("username") String username);
	 	 
	 @Modifying
	 @Query("delete from Account a where a.username=:username")
	 void deleteAccount(@Param("username") String username);
	 
	 @Modifying
	 @Query("UPDATE Account a SET a.name = :name, a.hashedPassword = :hashedPassword, a.Email = :Email WHERE a.username=:username")
	 int updateAccount(@Param("name") String name,@Param("hashedPassword") String hashedPassword,@Param("Email") String Email, @Param("username") String username);
	

}