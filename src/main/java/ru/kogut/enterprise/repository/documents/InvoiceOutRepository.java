package ru.kogut.enterprise.repository.documents;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kogut.enterprise.model.documents.InvoiceOutEntity;

@Repository
public interface InvoiceOutRepository extends JpaRepository<InvoiceOutEntity, String> {
}
