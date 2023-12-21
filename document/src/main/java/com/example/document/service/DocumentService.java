package com.example.document.service;

import com.example.document.repository.DocumentRepository;
import com.example.document.entities.Document;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class DocumentService {

    @Autowired
    private final DocumentRepository documentRepository;

    public Document storeDocument(Document document) {
        return documentRepository.save(document);
    }
    public Document retrieveDocument(String documentId) {
        return documentRepository.findByDocumentId(documentId);
    }

}
