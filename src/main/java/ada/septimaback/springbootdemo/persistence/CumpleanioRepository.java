package ada.septimaback.springbootdemo.persistence;

import ada.septimaback.springbootdemo.model.Cumpleanio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CumpleanioRepository extends JpaRepository<Cumpleanio, Long> {
}