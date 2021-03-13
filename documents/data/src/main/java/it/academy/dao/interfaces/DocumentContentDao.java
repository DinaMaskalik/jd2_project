package it.academy.dao.interfaces;

import it.academy.entity.Content;
import org.springframework.data.repository.CrudRepository;

public interface DocumentContentDao extends CrudRepository<Content, String> {

}
