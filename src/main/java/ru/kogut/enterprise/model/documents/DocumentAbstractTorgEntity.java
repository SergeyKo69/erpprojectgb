package ru.kogut.enterprise.model.documents;

import org.intellij.lang.annotations.Identifier;
import ru.kogut.enterprise.model.AbstractEntity;
import ru.kogut.enterprise.model.dictionaries.ClientEntity;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@MappedSuperclass
public class DocumentAbstractTorgEntity extends AbstractEntity {

    @Column(name = "number")
    private String number;

    @Column(name = "date")
    private Date date;

    @Column(name = "isDelete")
    private boolean isDelete;

    @OneToOne
    @JoinColumn(name = "client")
    private ClientEntity clientEntity;

    @Column(name = "comment")
    private String comment;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public ClientEntity getClientEntity() {
        return clientEntity;
    }

    public void setClientEntity(ClientEntity clientEntity) {
        this.clientEntity = clientEntity;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
