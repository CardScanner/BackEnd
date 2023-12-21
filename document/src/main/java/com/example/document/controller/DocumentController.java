package com.example.document.controller;

import com.example.document.entities.Document;
import com.example.document.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/document")
@RequiredArgsConstructor
public class DocumentController {
    @Autowired
    private final DocumentService documentService;

    @PostMapping("")
    public Document storeDocument(@RequestBody Document document) {
        return documentService.storeDocument(document);
    }

    @GetMapping("/{documentId}")
    public Document retrieveDocument(@PathVariable String documentId) {
        return documentService.retrieveDocument(documentId);
    }
}
