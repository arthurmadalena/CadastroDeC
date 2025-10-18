package dev.JavaTeste.cadastroDe.Users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired //Injeção de dependência (Injeta automáticamente o repositório)
    private UserRepository userRepository;

    //Metodo para listar todos os usuários
    public List<UserModel> listarUsuarios() {
        return userRepository.findAll();
    }

    //Metodo para salvar um novo usuario
    public UserModel salvarUsuario(UserModel user) {
        return userRepository.save(user);
    }

    // Metodo para atualizar um usuário existente
    public UserModel atualizarUsuario(Long id, UserModel user) {
        user.setId(id);
        return userRepository.save(user);
    }

    // Metodo para excluir um usuário pelo ID
    public void deletarUsuario(Long id) {
        userRepository.deleteById(id);
    }


}
