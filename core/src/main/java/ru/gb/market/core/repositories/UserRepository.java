package ru.gb.market.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.market.core.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByLogin(String login);

}