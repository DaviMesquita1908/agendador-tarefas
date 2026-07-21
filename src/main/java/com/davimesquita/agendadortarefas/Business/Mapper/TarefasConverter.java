package com.davimesquita.agendadortarefas.Business.Mapper;

import com.davimesquita.agendadortarefas.Business.DTO.TarefasDTO;
import com.davimesquita.agendadortarefas.Infrastructure.Entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")

public interface TarefasConverter {

    @Mapping(source = "id", target = "id")
    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity tarefasEntity);

    List<TarefasEntity> paraListaTarefasEntity(List<TarefasDTO> dtos);

    List<TarefasDTO> paraListaTarefasDTO(List<TarefasEntity> entitys);

}
