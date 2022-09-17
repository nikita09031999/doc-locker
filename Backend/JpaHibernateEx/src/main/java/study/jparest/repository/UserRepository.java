package study.jparest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.jparest.entity.User_info_tbl;

@Repository
public interface UserRepository extends JpaRepository<User_info_tbl,Integer> {

}
