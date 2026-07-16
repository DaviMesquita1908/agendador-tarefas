package com.davimesquita.agendadortarefas.Business;

import com.davimesquita.agendadortarefas.Business.DTO.TarefasDTO;
import com.davimesquita.agendadortarefas.Business.Mapper.TarefasConverter;
import com.davimesquita.agendadortarefas.Infrastructure.Entity.TarefasEntity;
import com.davimesquita.agendadortarefas.Infrastructure.Enums.StatusNotificacaoEnum;
import com.davimesquita.agendadortarefas.Infrastructure.Repository.TarefasRepository;
import com.davimesquita.agendadortarefas.Infrastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor

public class TarefasService {

    private final TarefasRepository tarefasRepository;
    private final TarefasConverter tarefasConverter;
    private final JwtUtil jwtUtil;

    public TarefasDTO gravarTarefa(String token, TarefasDTO dto) {

        String email = jwtUtil.extrairEmailToken((token.substring(7)));

        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        dto.setEmailUsuario(email);
        TarefasEntity tarefasEntity = tarefasConverter. paraTarefaEntity(dto);

        return tarefasConverter.paraTarefaDTO(
                tarefasRepository.save(tarefasEntity));
    }

}
