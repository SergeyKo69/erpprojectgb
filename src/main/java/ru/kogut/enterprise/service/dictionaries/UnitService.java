package ru.kogut.enterprise.service.dictionaries;

import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.model.dictionaries.UnitEntity;

import java.util.List;

public interface UnitService {
    Answer save(UnitEntity unit);
    Answer update(UnitEntity unit);
    UnitEntity getById(String id);
    List<UnitEntity> getAll();
    void delete(UnitEntity unit, boolean delete);
}
