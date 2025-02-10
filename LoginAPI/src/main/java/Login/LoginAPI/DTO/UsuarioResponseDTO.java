package Login.LoginAPI.DTO;

public class UsuarioResponseDTO {
    private Long idUsuario;
    private String nomeUsuario;

    // Construtores, Getters e Setters
    public UsuarioResponseDTO(Long idUsuario, String nomeUsuario) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
}