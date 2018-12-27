package ru.kogut.enterprise.service.dictionaries;

import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.model.dictionaries.FirmEntity;

import java.util.List;

public interface FirmService {
    Answer save(FirmEntity firm);
    Answer update(FirmEntity firm);
    FirmEntity getById(String id);
    List<FirmEntity> getAll();
    void delete(FirmEntity firm, boolean delete);
}
