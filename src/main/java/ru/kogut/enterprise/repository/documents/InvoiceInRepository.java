package ru.kogut.enterprise.repository.documents;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kogut.enterprise.model.documents.InvoiceInEntity;

@Repository
public interface InvoiceInRepository extends JpaRepository<InvoiceInEntity, String> {
}
