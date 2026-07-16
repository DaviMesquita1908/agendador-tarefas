package com.davimesquita.agendadortarefas.Infrastructure.Repository;

import com.davimesquita.agendadortarefas.Infrastructure.Entity.TarefasEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TarefasRepository extends MongoRepository<TarefasEntity, String> {
}
