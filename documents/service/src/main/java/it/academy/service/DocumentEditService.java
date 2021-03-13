package it.academy.service;

import it.academy.dao.interfaces.DocumentContentDao;
import it.academy.dao.interfaces.DocumentDao;
import it.academy.dao.interfaces.DocumentNameDao;
import it.academy.dto.DocumentEditDto;
import it.academy.dto.transform.TransformDocumentEditDtoInDocumentEntity;
import it.academy.entity.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DocumentEditService {

    @Autowired
    DocumentDao documentDao;

    @Autowired
    DocumentNameDao documentNameDao;

    @Autowired
    DocumentContentDao documentContentDao;

    @Autowired
    TransformDocumentEditDtoInDocumentEntity transformDocumentEditDtoInDocumentEntity;

    public Document findDocument(String id){
        return documentDao.findByDocumentId(id);
    }

    @Transactional
    public Document editDocument(Document document, DocumentEditDto documentEditDto){

        Document transformDocumentEditDto = transformDocumentEditDtoInDocumentEntity.transformDocumentEditDto(document, documentEditDto);

        documentNameDao.save(transformDocumentEditDto.getDocumentName());
        documentContentDao.save(transformDocumentEditDto.getContent());
        documentDao.save(transformDocumentEditDto);

        return transformDocumentEditDto;
    }
}
