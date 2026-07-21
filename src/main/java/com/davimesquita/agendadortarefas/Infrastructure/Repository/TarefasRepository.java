package com.davimesquita.agendadortarefas.Infrastructure.Repository;

import com.davimesquita.agendadortarefas.Infrastructure.Entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface TarefasRepository extends MongoRepository<TarefasEntity, String> {

    List<TarefasEntity> findBydataEventoBetween(LocalDateTime dataInicial, LocalDateTime dataFinal);

    List<TarefasEntity> findByEmailUsuario(String email);

}
