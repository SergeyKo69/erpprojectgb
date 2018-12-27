package ru.kogut.enterprise.repository.registers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kogut.enterprise.model.registers.CostRegEntity;

@Repository
public interface RegCostRepository extends JpaRepository<CostRegEntity, String> {
}
