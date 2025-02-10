package Login.LoginAPI.controllers;

import Login.LoginAPI.dtos.LoginRequestDTO;
import Login.LoginAPI.models.Usuario;
import Login.LoginAPI.services.JWTService;
import Login.LoginAPI.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private JWTService jwtService;

    // Criação de novo usuário
    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario) {
        Usuario novoUsuario = usuarioService.criarUsuario(usuario);
        return ResponseEntity.ok(novoUsuario);
    }

    // Login do usuário e geração do token
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequestDTO loginRequest) {
        Optional<Usuario> usuario = usuarioService.buscarPorNomeUsuario(loginRequest.getNomeUsuario());

        if (usuario.isPresent() && usuario.get().getSenha().equals(loginRequest.getSenha())) {
            String token = jwtService.generateToken(usuario.get().getNomeUsuario());
            return ResponseEntity.ok(token);  // Retorna o token JWT
        } else {
            return ResponseEntity.status(401).body("Credenciais inválidas");
        }
    }

    // Buscar usuário por nome
    @GetMapping("/{nomeUsuario}")
    public ResponseEntity<Usuario> buscarUsuarioPorNome(@PathVariable String nomeUsuario) {
        Optional<Usuario> usuario = usuarioService.buscarPorNomeUsuario(nomeUsuario);
        return usuario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Excluir usuário pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirUsuario(@PathVariable Long id) {
        usuarioService.excluirUsuario(id);
        return ResponseEntity.noContent().build();
    }
}
