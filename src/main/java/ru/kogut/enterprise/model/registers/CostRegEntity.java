package ru.kogut.enterprise.model.registers;

import ru.kogut.enterprise.model.dictionaries.ProductEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "regcost")
public class CostRegEntity extends AbstractRegisterEntity {

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "product")
    private ProductEntity product;

    @Column(name = "cost")
    private BigDecimal cost;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
