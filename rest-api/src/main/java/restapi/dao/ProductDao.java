package restapi.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import restapi.domain.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
  
  List<Product> findByExpiredDateLessThanEqual(LocalDate expiredDate);
  
  List<Product> findByCostBetween(Double min, Double max);

}
