package ru.kogut.enterprise.service.dictionaries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.enums.Answers;
import ru.kogut.enterprise.model.dictionaries.ClientEntity;
import ru.kogut.enterprise.repository.dictionaries.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Answer save(ClientEntity client) {
        if (client == null) return new Answer(Answers.ERROR,"Client is empty");
        if (clientRepository.save(client) == null){
            return new Answer(Answers.ERROR, "Error save client: " + client.getName());
        }
        return new Answer(Answers.OK);
    }

    @Override
    public Answer update(ClientEntity client) {
        return save(client);
    }

    @Override
    public ClientEntity getById(String id) {
        if (id.isEmpty()) return null;
        Optional<ClientEntity> optionalClientEntity = clientRepository.findById(id);
        return optionalClientEntity.get();
    }

    @Override
    public List<ClientEntity> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public void delete(ClientEntity client, boolean delete) {
        if (client == null) return;
        client.setDelete(delete);
        save(client);
    }
}
