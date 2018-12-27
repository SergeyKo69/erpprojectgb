package ru.kogut.enterprise.service.dictionaries;

import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.model.dictionaries.ClientEntity;

import java.util.List;

public interface ClientService {
    Answer save(ClientEntity client);
    Answer update(ClientEntity client);
    ClientEntity getById(String id);
    List<ClientEntity> getAll();
    void delete(ClientEntity client, boolean delete);
}
