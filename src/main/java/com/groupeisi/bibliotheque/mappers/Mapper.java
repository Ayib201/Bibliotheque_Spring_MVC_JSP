package com.groupeisi.bibliotheque.mappers;

import java.util.List;

public interface Mapper<E, L, D, C> {

    // Entité -> DTO liste (champs minimaux, pour affichage en tableau)
    L toListDto(E entity);

    // Entité -> DTO détail (champs complets, pour une fiche)
    D toDetailDto(E entity);

    // DTO création -> Entité (à la création, pas d'ID en entrée)
    E toEntity(C createDto);

    List<L> toListDtoList(List<E> entities) ;
}