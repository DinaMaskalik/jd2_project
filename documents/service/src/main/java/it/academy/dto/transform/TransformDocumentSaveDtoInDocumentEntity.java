package it.academy.dto.transform;

import it.academy.dto.DocumentSaveDto;
import it.academy.entity.Content;
import it.academy.entity.Document;
import it.academy.entity.DocumentName;
import org.springframework.stereotype.Component;

@Component
public class TransformDocumentSaveDtoInDocumentEntity {

    public Document transform(DocumentSaveDto documentSaveDto){

        Document document = new Document();

        document.setContent(new Content(null, documentSaveDto.getContent()));
        document.setDocumentName(new DocumentName(null, documentSaveDto.getDocumentName()));
        document.setAuthor(documentSaveDto.getAuthor());
        document.setPersonWithWhomTheContractWasSigned(documentSaveDto.getPersonWithWhomTheContractWasSigned());
        document.setPersonWhoConcludedContract(documentSaveDto.getPersonWhoConcludedContract());
        document.setPeriodOfExecution(documentSaveDto.getPeriodOfExecution());
        document.setCreateDate(new java.sql.Date( (new java.util.Date()).getTime()));

        return document;

    }
}
