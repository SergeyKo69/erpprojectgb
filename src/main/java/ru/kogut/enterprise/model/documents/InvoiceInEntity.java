package ru.kogut.enterprise.model.documents;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "invoicein")
public class InvoiceInEntity extends DocumentAbstractTorgEntity {

    @OneToOne
    @JoinColumn(name = "tabDocument")
    private DocumentAbstractTabTorgEntity tab;

    public DocumentAbstractTabTorgEntity getTab() {
        return tab;
    }

    public void setTab(DocumentAbstractTabTorgEntity tab) {
        this.tab = tab;
    }
}
