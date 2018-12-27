package ru.kogut.enterprise.model.dictionaries;

import ru.kogut.enterprise.model.dictionaries.DictionaryAbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class ClientEntity extends DictionaryAbstractEntity {

    @Column(name = "urAddress")
    private String urAddress;

    @Column(name = "phizAddress")
    private String phizAddress;

    public String getUrAddress() {
        return urAddress;
    }

    public void setUrAddress(String urAddress) {
        this.urAddress = urAddress;
    }

    public String getPhizAddress() {
        return phizAddress;
    }

    public void setPhizAddress(String phizAddress) {
        this.phizAddress = phizAddress;
    }
}
