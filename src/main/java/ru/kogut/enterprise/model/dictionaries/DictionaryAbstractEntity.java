package ru.kogut.enterprise.model.dictionaries;

import ru.kogut.enterprise.model.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public class DictionaryAbstractEntity extends AbstractEntity {

    @Column(name = "kod")
    private String kod;

    @Column(name = "isDelete")
    private boolean isDelete;

    @Column(name = "name")
    private String name;

    @Column(name = "discription")
    private String discription;

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
