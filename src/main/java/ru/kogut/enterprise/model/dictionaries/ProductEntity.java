package ru.kogut.enterprise.model.dictionaries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class ProductEntity extends DictionaryAbstractEntity {

    @Column(name = "artikul")
    private String artikul;

    @Column(name = "baseUnit")
    private UnitEntity baseUnit;

    public String getArtikul() {
        return artikul;
    }

    public void setArtikul(String artikul) {
        this.artikul = artikul;
    }

    public UnitEntity getBaseUnit() {
        return baseUnit;
    }

    public void setBaseUnit(UnitEntity baseUnit) {
        this.baseUnit = baseUnit;
    }
}
