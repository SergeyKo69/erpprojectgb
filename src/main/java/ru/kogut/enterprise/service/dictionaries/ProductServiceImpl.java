package ru.kogut.enterprise.service.dictionaries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kogut.enterprise.common.Answer;
import ru.kogut.enterprise.enums.Answers;
import ru.kogut.enterprise.model.dictionaries.ProductEntity;
import ru.kogut.enterprise.repository.dictionaries.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Answer save(ProductEntity product) {
        if (product == null) return new Answer(Answers.ERROR,"Product is empty");
        if (productRepository.save(product) == null){
            return new Answer(Answers.ERROR, "Error save product: " + product.getName());
        }
        return new Answer(Answers.OK);
    }

    @Override
    public Answer update(ProductEntity product) {
        return save(product);
    }

    @Override
    public ProductEntity getById(String id) {
        if (id.isEmpty()) return null;
        Optional<ProductEntity> optionalProductEntity = productRepository.findById(id);
        return optionalProductEntity.get();
    }

    @Override
    public List<ProductEntity> getAll() {
        return productRepository.findAll();
    }

    @Override
    public void delete(ProductEntity product, boolean delete) {
        if (product == null) return;
        product.setDelete(delete);
        save(product);
    }
}
