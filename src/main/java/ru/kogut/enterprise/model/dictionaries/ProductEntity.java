package ru.kogut.enterprise.model.dictionaries;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class ProductEntity extends DictionaryAbstractEntity {

    @Column(name = "artikul")
    private String artikul;

    @OneToOne
    @JoinColumn(name = "baseUnit")
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
