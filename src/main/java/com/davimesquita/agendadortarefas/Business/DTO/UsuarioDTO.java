package com.davimesquita.agendadortarefas.Business.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UsuarioDTO {

    private String email;
    private String senha;

}
