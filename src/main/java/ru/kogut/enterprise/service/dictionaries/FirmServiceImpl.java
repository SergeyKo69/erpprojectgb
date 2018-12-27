package ru.kogut.enterprise.service.dictionaries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.enums.Answers;
import ru.kogut.enterprise.model.dictionaries.FirmEntity;
import ru.kogut.enterprise.repository.dictionaries.FirmRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FirmServiceImpl implements FirmService {

    @Autowired
    private FirmRepository firmRepository;

    @Override
    public Answer save(FirmEntity firm) {
        if (firm == null) return new Answer(Answers.ERROR,"Firm is empty");
        if (firmRepository.save(firm) == null){
            return new Answer(Answers.ERROR, "Error save firm: " + firm.getName());
        }
        return new Answer(Answers.OK);
    }

    @Override
    public Answer update(FirmEntity firm) {
        return save(firm);
    }

    @Override
    public FirmEntity getById(String id) {
        if (id.isEmpty()) return null;
        Optional<FirmEntity> optionalFirmEntity = firmRepository.findById(id);
        return optionalFirmEntity.get();
    }

    @Override
    public List<FirmEntity> getAll() {
        return firmRepository.findAll();
    }

    @Override
    public void delete(FirmEntity firm, boolean delete) {
        if (firm == null) return;
        firm.setDelete(delete);
        save(firm);
    }
}
