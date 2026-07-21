package com.groupeisi.bibliotheque.dto.auteur;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuteurListDto {
    private Long id;
    private String nom;
    private String prenom;
    private String nationalite;
}
