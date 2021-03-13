package it.academy.controller;

import it.academy.entity.Document;
import it.academy.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class HomeDocumentController {

    @Autowired
    DocumentService documentService;

    @GetMapping("/document")
    public String homePage(
//            @RequestParam(value = "pageCount", required = false, defaultValue = "5") String count,
            @RequestParam(value = "pageNumber", required = false, defaultValue = "1") String pageNumber,
//            @RequestParam Map<String, String> allParams,
            Model model
    ) {
        final int countDocumentInPage = 2;
        final long allDocumentCount = documentService.getAllDocumentCount();

        Pageable page = PageRequest.of(Integer.parseInt(pageNumber) - 1, countDocumentInPage);

        List<Document> allDocument = documentService.getAllDocument(page);
        model.addAttribute("documentsList", allDocument);

        if (allDocumentCount % countDocumentInPage == 0) {
            model.addAttribute("pageCount", Math.floor(allDocumentCount / countDocumentInPage));
        } else {
            model.addAttribute("pageCount", Math.floor(allDocumentCount / countDocumentInPage) + 1);
        }

        return "index";
    }

    @GetMapping("/document/{id}")
    public String getDocument(
            @PathVariable(name = "id") String id,
            Model model
    ){

        return "document";
    }
}
