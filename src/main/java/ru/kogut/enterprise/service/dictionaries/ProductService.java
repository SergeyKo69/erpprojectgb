package ru.kogut.enterprise.service.dictionaries;

import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.model.dictionaries.ProductEntity;

import java.util.List;

public interface ProductService {
    Answer save(ProductEntity product);
    Answer update(ProductEntity product);
    ProductEntity getById(String id);
    List<ProductEntity> getAll();
    void delete(ProductEntity product, boolean delete);
}
