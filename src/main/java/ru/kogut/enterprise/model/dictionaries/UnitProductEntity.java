package ru.kogut.enterprise.model.dictionaries;

import ru.kogut.enterprise.model.dictionaries.DictionaryAbstractEntity;
import ru.kogut.enterprise.model.dictionaries.ProductEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productUnits")
public class UnitProductEntity extends DictionaryAbstractEntity {

    @Column(name = "product_id")
    @ManyToOne
    private ProductEntity product;

    @Column(name = "unit_id")
    private String unit_id;

    @Column(name = "kratnost")
    private int kratnost;

    public int getKratnost() {
        return kratnost;
    }

    public void setKratnost(int kratnost) {
        this.kratnost = kratnost;
    }

    public String getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(String unit_id) {
        this.unit_id = unit_id;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct_id(ProductEntity product) {
        this.product = product;
    }
}
