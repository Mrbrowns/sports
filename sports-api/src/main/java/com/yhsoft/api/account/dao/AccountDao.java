package com.yhsoft.api.account.dao;

import com.yhsoft.api.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface AccountDao extends JpaRepository<Account, Long>  {
    /**
     * Find by name.
     *
     * @param name the name
     * @return the user
     */
    Account findByName(String name);

    /**
     * Find by name and user name.
     * 如果参数名为多个字母组成，请首字母大写。勿使用驼峰命名，jpa不识别驼峰
     * @param name the name
     * @param age the age
     * @return the user
     */
    Account findByNameAndUsername(String name, Integer age);

    /**
     * Find user.
     * User为@Entity 的名字
     * @param name the name
     * @return the user
     */
    @Query("from Account u where u.name=:name")
    Account findUser(@Param("name") String name);
}
