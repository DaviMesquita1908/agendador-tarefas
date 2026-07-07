package com.davimesquita.agendadortarefas.Infrastructure.security;


import com.davimesquita.agendadortarefas.Business.UsuarioDTO;
import com.davimesquita.agendadortarefas.Infrastructure.Client.UsuarioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioClient client;

    // Implementação do método para carregar detalhes do usuário pelo e-mail

    public UserDetails carregaDadosUsuario(String email, String token) {
        UsuarioDTO usuarioDTO = client.buscaUsuarioPorEmail(email,token);
        return User
                .withUsername(usuarioDTO.getEmail()) // Define o nome de usuário como o e-mail
                .password(usuarioDTO.getSenha()) // Define a senha do usuário
                .build(); // Constrói o objeto UserDetails
    }

}
