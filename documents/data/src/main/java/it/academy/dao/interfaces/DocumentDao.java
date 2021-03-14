package it.academy.dao.interfaces;

//import it.academy.dto.DocumentViewDto;
import it.academy.entity.Document;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentDao extends CrudRepository<Document, String> {

    List<Document> findAllBy(Pageable pageable);

    Document findByDocumentId(String id);


}
