package dev.JavaTeste.cadastroDe.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")

public class UserController {
    @Autowired
    private UserService userService;

    //endpoint get - retorna todos os usuarios
    @GetMapping
    public List<UserModel> listarUsuarios() {
        return userService.listarUsuarios();
    }

    //endpoint post - cadastra um novo usuario
    @PostMapping
    public UserModel criarUsuario(@RequestBody UserModel user) {
        return userService.salvarUsuario(user);
    }

    //endpoint put - atualiza um usuario existente
    @PutMapping("/{id}")
    public UserModel atualizarUsuario(@PathVariable Long id, @RequestBody UserModel user) {
        return userService.atualizarUsuario(id, user);
    }

    //endpoint delete - remove um usuario por ID
    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        userService.deletarUsuario(id);
    }

}
