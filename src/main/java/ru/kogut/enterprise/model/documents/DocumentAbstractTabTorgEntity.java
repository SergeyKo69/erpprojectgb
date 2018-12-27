package ru.kogut.enterprise.model.documents;

import org.intellij.lang.annotations.Identifier;
import ru.kogut.enterprise.model.AbstractEntity;
import ru.kogut.enterprise.model.dictionaries.ProductEntity;
import ru.kogut.enterprise.model.dictionaries.UnitProductEntity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public class DocumentAbstractTabTorgEntity extends AbstractEntity {

    @Column(name = "product")
    private ProductEntity product;

    @Column(name = "quantity")
    private Double quantity;

    @Column(name = "unit")
    private UnitProductEntity unit;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "summa")
    private Double summa;

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public UnitProductEntity getUnit() {
        return unit;
    }

    public void setUnit(UnitProductEntity unit) {
        this.unit = unit;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getSumma() {
        return summa;
    }

    public void setSumma(Double summa) {
        this.summa = summa;
    }
}
