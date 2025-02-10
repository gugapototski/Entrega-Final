package Login.LoginAPI.services;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

@Service
public class JWTService {

    private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);  // Chave secreta para assinar o token
    private final long EXPIRATION_TIME = 86400000;  // 24 horas em milissegundos

    // Gera o token JWT
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)  // Define o usuário como o "assunto" do token
                .setIssuedAt(new Date())  // Data de emissão do token
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))  // Data de expiração
                .signWith(key)  // Assina o token com a chave secreta
                .compact();
    }

    // Valida o token JWT
    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Extrai o nome de usuário do token JWT
    public String extractUsername(String token) {
        return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token).getBody().getSubject();
    }
}
