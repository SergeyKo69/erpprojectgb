package ru.kogut.enterprise.service.dictionaries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.enums.Answers;
import ru.kogut.enterprise.model.dictionaries.UnitProductEntity;
import ru.kogut.enterprise.repository.dictionaries.UnitProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UnitProductServiceImpl implements UnitProductService{

    @Autowired
    private UnitProductRepository unitProductRepository;

    @Override
    public Answer save(UnitProductEntity unitProduct) {
        if (unitProduct == null) return new Answer(Answers.ERROR,"Unit product is empty");
        if (unitProductRepository.save(unitProduct) == null){
            return new Answer(Answers.ERROR, "Error save unit product: " + unitProduct.getName());
        }
        return new Answer(Answers.OK);
    }

    @Override
    public Answer update(UnitProductEntity unitProduct) {
        return save(unitProduct);
    }

    @Override
    public UnitProductEntity getById(String id) {
        if (id.isEmpty()) return null;
        Optional<UnitProductEntity> optionalUnitProductEntity = unitProductRepository.findById(id);
        return optionalUnitProductEntity.get();
    }

    @Override
    public List<UnitProductEntity> getAll() {
        return unitProductRepository.findAll();
    }

    @Override
    public void delete(UnitProductEntity unitProduct, boolean delete) {
        if (unitProduct == null) return;
        unitProduct.setDelete(delete);
        save(unitProduct);
    }
}
