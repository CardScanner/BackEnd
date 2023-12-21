package com.example.document.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "document_id", unique = true, nullable = false)
    private String documentId;
    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String photo;
}
