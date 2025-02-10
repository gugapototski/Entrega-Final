package Login.LoginAPI.services;

import Login.LoginAPI.models.Usuario;
import Login.LoginAPI.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(Usuario usuario) {

        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> buscarPorNomeUsuario(String nomeUsuario) {
        return usuarioRepository.findByNomeUsuario(nomeUsuario);
    }

    public void excluirUsuario(Long idUsuario) {
        usuarioRepository.deleteById(idUsuario);
    }
}
