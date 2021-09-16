package uz.hrm.user.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.hrm.user.service.domain.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByUsername(String username);
    User findByEmail(String email);

    List<User> findAllBy();

}
