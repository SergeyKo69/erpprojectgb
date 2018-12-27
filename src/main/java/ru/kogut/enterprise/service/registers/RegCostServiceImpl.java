package ru.kogut.enterprise.service.registers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.enums.Answers;
import ru.kogut.enterprise.model.documents.InvoiceOutEntity;
import ru.kogut.enterprise.model.registers.CostRegEntity;
import ru.kogut.enterprise.repository.registers.RegCostRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RegCostServiceImpl implements RegCostService{

    @Autowired
    private RegCostRepository regCostRepository;

    @Override
    public Answer save(CostRegEntity costReg) {
        if (costReg == null) return new Answer(Answers.ERROR,"Register cost is empty");
        if (regCostRepository.save(costReg) == null){
            return new Answer(Answers.ERROR, "Error save register cost");
        }
        return new Answer(Answers.OK);
    }

    @Override
    public Answer update(CostRegEntity costReg) {
        return save(costReg);
    }

    @Override
    public CostRegEntity getById(String id) {
        if (id.isEmpty()) return null;
        Optional<CostRegEntity> optionalCostRegEntity = regCostRepository.findById(id);
        return optionalCostRegEntity.get();
    }

    @Override
    public List<CostRegEntity> getAll() {
        return regCostRepository.findAll();
    }

    @Override
    public void delete(CostRegEntity costReg) {
        if (costReg == null) return;
        regCostRepository.delete(costReg);
    }
}
