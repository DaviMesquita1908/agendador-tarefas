package com.davimesquita.agendadortarefas.Business.Mapper;

import com.davimesquita.agendadortarefas.Business.DTO.TarefasDTO;
import com.davimesquita.agendadortarefas.Infrastructure.Entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity tarefasEntity);

}
