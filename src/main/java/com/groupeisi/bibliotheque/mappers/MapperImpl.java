package com.groupeisi.bibliotheque.mappers;


import java.util.List;
import java.util.stream.Collectors;

public abstract class MapperImpl<E,L,D,C> implements Mapper<E,L,D,C> {
    @Override
    public List<L> toListDtoList(List<E> entities) {
        return entities.stream()
                .map(this::toListDto)
                .collect(Collectors.toList());
    }
}