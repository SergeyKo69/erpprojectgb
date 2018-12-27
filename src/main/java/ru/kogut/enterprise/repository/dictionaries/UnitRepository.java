package ru.kogut.enterprise.repository.dictionaries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kogut.enterprise.model.dictionaries.UnitEntity;

@Repository
public interface UnitRepository extends JpaRepository<UnitEntity, String> {
}
