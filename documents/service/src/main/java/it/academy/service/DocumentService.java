package it.academy.service;

import it.academy.dao.interfaces.DocumentDao;
//import it.academy.dao.interfaces.DocumentViewDao;
//import it.academy.dto.DocumentViewDto;
//import it.academy.dao.interfaces.DocumentViewDao;
import it.academy.entity.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DocumentService {

    @Autowired
    DocumentDao documentDao;

//    @Autowired
//    DocumentViewDao documentViewDao;

    public List<Document> getAllDocument(Pageable pageable){
        return documentDao.findAllBy(pageable);
    }

    public long getAllDocumentCount(){
        return documentDao.count();
    }

//    public DocumentViewDto getDocument(String id){
//        return documentViewDao.findByDocumentId(id);
//    }

}
