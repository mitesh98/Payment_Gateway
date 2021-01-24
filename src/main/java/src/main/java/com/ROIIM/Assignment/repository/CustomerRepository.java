package src.main.java.com.ROIIM.Assignment.repository;

import src.main.java.com.ROIIM.Assignment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByEmail(String emailId );
}