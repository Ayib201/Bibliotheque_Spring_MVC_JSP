package com.groupeisi.bibliotheque.dto.auteur;

import com.groupeisi.bibliotheque.entities.Livre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AuteurDetailDto {
    private Long id;
    private String nom;
    private String prenom;
    private String nationalite;
    private List<Livre> livres;
}
