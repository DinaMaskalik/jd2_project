package it.academy.controller;

import it.academy.dto.DocumentSaveDto;
import it.academy.entity.Document;
import it.academy.service.DocumentSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddDocumentController {

    @Autowired
    DocumentSaveService documentSaveService;

    @PostMapping("/document/add")
    public String addDocument(
            @ModelAttribute DocumentSaveDto documentSaveDto
            ){

        documentSaveService.saveNewDocument(documentSaveDto);

        return "redirect:/document";

    }

    @GetMapping("/document/add")
    public String addDocumentPage(){

        return "add-document";

    }
}
