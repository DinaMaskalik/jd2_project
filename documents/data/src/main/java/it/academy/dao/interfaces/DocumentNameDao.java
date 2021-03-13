package it.academy.dao.interfaces;

import it.academy.entity.DocumentName;
import org.springframework.data.repository.CrudRepository;

public interface DocumentNameDao extends CrudRepository<DocumentName,String> {
}
