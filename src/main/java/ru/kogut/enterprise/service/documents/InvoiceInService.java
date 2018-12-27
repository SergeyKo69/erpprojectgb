package ru.kogut.enterprise.service.documents;

import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.model.documents.InvoiceInEntity;

import java.util.List;

public interface InvoiceInService {
    Answer save(InvoiceInEntity invoice);
    Answer update(InvoiceInEntity invoice);
    InvoiceInEntity getById(String id);
    List<InvoiceInEntity> getAll();
    void delete(InvoiceInEntity invoice, boolean delete);
}
