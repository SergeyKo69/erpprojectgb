package ru.kogut.enterprise.service.registers;

import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.model.registers.CostRegEntity;

import java.util.List;

public interface RegCostService {
    Answer save(CostRegEntity costReg);
    Answer update(CostRegEntity costReg);
    CostRegEntity getById(String id);
    List<CostRegEntity> getAll();
    void delete(CostRegEntity costReg);
}
