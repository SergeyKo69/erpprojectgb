package ru.kogut.enterprise.model.dictionaries;

import ru.kogut.enterprise.model.dictionaries.DictionaryAbstractEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "unit")
public class UnitEntity extends DictionaryAbstractEntity {
}
