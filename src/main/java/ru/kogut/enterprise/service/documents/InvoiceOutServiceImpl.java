package ru.kogut.enterprise.service.documents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.enums.Answers;
import ru.kogut.enterprise.model.documents.InvoiceOutEntity;
import ru.kogut.enterprise.repository.documents.InvoiceOutRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceOutServiceImpl  implements InvoiceOutService{

    @Autowired
    private InvoiceOutRepository invoiceRepository;


    @Override
    public Answer save(InvoiceOutEntity invoice) {
        if (invoice == null) return new Answer(Answers.ERROR,"Invoice out is empty");
        if (invoiceRepository.save(invoice) == null){
            return new Answer(Answers.ERROR, "Error save invoice out: " + invoice.getNumber());
        }
        return new Answer(Answers.OK);
    }

    @Override
    public Answer update(InvoiceOutEntity invoice) {
        return save(invoice);
    }

    @Override
    public InvoiceOutEntity getById(String id) {
        if (id.isEmpty()) return null;
        Optional<InvoiceOutEntity> optionalInvoiceOutEntity = invoiceRepository.findById(id);
        return optionalInvoiceOutEntity.get();
    }

    @Override
    public List<InvoiceOutEntity> getAll() {
        return invoiceRepository.findAll();
    }

    @Override
    public void delete(InvoiceOutEntity invoice, boolean delete) {
        if (invoice == null) return;
        invoice.setDelete(delete);
        save(invoice);
    }
}
