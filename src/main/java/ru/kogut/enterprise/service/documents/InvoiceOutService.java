package ru.kogut.enterprise.service.documents;

import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.model.documents.InvoiceOutEntity;

import java.util.List;

public interface InvoiceOutService {
    Answer save(InvoiceOutEntity invoice);
    Answer update(InvoiceOutEntity invoice);
    InvoiceOutEntity getById(String id);
    List<InvoiceOutEntity> getAll();
    void delete(InvoiceOutEntity invoice, boolean delete);
}
