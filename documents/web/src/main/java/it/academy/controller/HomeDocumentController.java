package it.academy.controller;

//import it.academy.dto.DocumentViewDto;

import it.academy.entity.Document;
import it.academy.service.DocumentEditService;
import it.academy.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class HomeDocumentController {

//    @Value("documentName.documentName")
//    private String sortValue;

    @Autowired
    DocumentService documentService;

    @Autowired
    DocumentEditService documentEditService;

    @GetMapping("/document")
    public String homePage(
            @RequestParam(value = "pageNumber", defaultValue = "1") String pageNumber,
            @RequestParam(value = "sort", required = false) String sortValue,
//            @RequestParam Map<String, String> allParams,
            Model model
    ) {
        final int countDocumentInPage = 3;

//        System.out.println(allParams.get("pageNumber"));
//        System.out.println(allParams.get("sort"));

        List<Document> allDocument = documentService.getAllDocument(pageNumber, countDocumentInPage, sortValue);

        model.addAttribute("documentsList", allDocument);

        model.addAttribute("pageCount", documentService.getNumberOfPage(countDocumentInPage));

//        List<Document> allDocument = documentService.getAllDocument(allParams.get("pageNumber"), countDocumentInPage, allParams.get("sort"));
//
//        model.addAttribute("documentsList", allDocument);
//
//        model.addAttribute("pageCount", documentService.getNumberOfPage(countDocumentInPage));
//
        return "index";
    }

    @GetMapping("/document/{id}")
    public String getDocument(
            @PathVariable(name = "id") String id,
            Model model
    ) {
        final Document document = documentEditService.findDocument(id);

        model.addAttribute("document", document);

        return "document";
    }
}
