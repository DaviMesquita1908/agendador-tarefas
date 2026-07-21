package com.davimesquita.agendadortarefas.Business.Mapper;

import com.davimesquita.agendadortarefas.Business.DTO.TarefasDTO;
import com.davimesquita.agendadortarefas.Infrastructure.Entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)

public interface TarefaUpdateConverter {

    void updateTarefas(TarefasDTO dto, @MappingTarget TarefasEntity entity);

}
