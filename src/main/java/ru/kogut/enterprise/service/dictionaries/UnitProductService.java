package ru.kogut.enterprise.service.dictionaries;

import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.model.dictionaries.UnitProductEntity;

import java.util.List;

public interface UnitProductService {
    Answer save(UnitProductEntity unitProduct);
    Answer update(UnitProductEntity unitProduct);
    UnitProductEntity getById(String id);
    List<UnitProductEntity> getAll();
    void delete(UnitProductEntity unitProduct, boolean delete);
}
