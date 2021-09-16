package uz.hrm.lib.model.mapper;

import java.util.List;

public interface MapperInterface<D,E> {

    D toDto(E entity);
    E toEntity(D dto);
    List<D> toDto(List<E> entityList);
    List<E> toEntity(List<D> dtoList);

}
