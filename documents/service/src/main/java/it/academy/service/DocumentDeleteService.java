package it.academy.service;

import it.academy.dao.interfaces.DocumentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentDeleteService {

    @Autowired
    DocumentDao documentDao;

    public void deleteDocument(String id){
        documentDao.deleteById(id);
    }

}
