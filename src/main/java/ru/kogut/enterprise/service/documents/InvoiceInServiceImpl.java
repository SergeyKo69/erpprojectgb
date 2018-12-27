package ru.kogut.enterprise.service.documents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.enums.Answers;
import ru.kogut.enterprise.model.documents.InvoiceInEntity;
import ru.kogut.enterprise.repository.documents.InvoiceInRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceInServiceImpl implements InvoiceInService {

    @Autowired
    private InvoiceInRepository invoiceRepository;

    @Override
    public Answer save(InvoiceInEntity invoice) {
        if (invoice == null) return new Answer(Answers.ERROR,"Invoice in is empty");
        if (invoiceRepository.save(invoice) == null){
            return new Answer(Answers.ERROR, "Error save invoice in: " + invoice.getNumber());
        }
        return new Answer(Answers.OK);
    }

    @Override
    public Answer update(InvoiceInEntity invoice) {
        return save(invoice);
    }

    @Override
    public InvoiceInEntity getById(String id) {
        if (id.isEmpty()) return null;
        Optional<InvoiceInEntity> optionalInvoiceInEntity = invoiceRepository.findById(id);
        return optionalInvoiceInEntity.get();
    }

    @Override
    public List<InvoiceInEntity> getAll() {
        return invoiceRepository.findAll();
    }

    @Override
    public void delete(InvoiceInEntity invoice, boolean delete) {
        if (invoice == null) return;
        invoice.setDelete(delete);
        save(invoice);
    }
}
