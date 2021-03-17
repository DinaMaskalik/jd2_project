package it.academy.service;

import it.academy.dao.interfaces.DocumentDao;
import it.academy.entity.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentDeleteService {

    @Autowired
    DocumentDao documentDao;

//    @Autowired
//    DocumentNameDao documentNameDao;
//
//    @Autowired
//    DocumentContentDao documentContentDao;

    public void deleteDocument(String id) {

        final Document document = documentDao.findByDocumentId(id);

        documentDao.deleteById(id);

//        if (documentDao.findByDocumentName(document.getDocumentName().getDocumentNameId()).size() == 0)
//            documentNameDao.delete(document.getDocumentName());
//
//        if (documentDao.findByContent(document.getContent().getContentId()).size() == 0)
//            documentContentDao.delete(document.getContent());

    }

}
