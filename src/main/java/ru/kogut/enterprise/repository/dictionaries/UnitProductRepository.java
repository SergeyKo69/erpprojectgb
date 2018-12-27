package ru.kogut.enterprise.repository.dictionaries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kogut.enterprise.model.dictionaries.UnitProductEntity;

@Repository
public interface UnitProductRepository extends JpaRepository<UnitProductEntity, String> {
}
