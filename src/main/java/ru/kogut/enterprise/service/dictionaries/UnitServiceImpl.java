package ru.kogut.enterprise.service.dictionaries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.enums.Answers;
import ru.kogut.enterprise.model.dictionaries.UnitEntity;
import ru.kogut.enterprise.repository.dictionaries.UnitRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UnitServiceImpl implements UnitService {

    @Autowired
    private UnitRepository unitRepository;

    @Override
    public Answer save(UnitEntity unit) {
        if (unit == null) return new Answer(Answers.ERROR,"Unit is empty");
        if (unitRepository.save(unit) == null){
            return new Answer(Answers.ERROR, "Error save unit: " + unit.getName());
        }
        return new Answer(Answers.OK);
    }

    @Override
    public Answer update(UnitEntity unit) {
        return save(unit);
    }

    @Override
    public UnitEntity getById(String id) {
        if (id.isEmpty()) return null;
        Optional<UnitEntity> optionalUnitEntity = unitRepository.findById(id);
        return optionalUnitEntity.get();
    }

    @Override
    public List<UnitEntity> getAll() {
        return unitRepository.findAll();
    }

    @Override
    public void delete(UnitEntity unit, boolean delete) {
        if (unit == null) return;
        unit.setDelete(delete);
        save(unit);
    }
}
