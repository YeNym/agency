package agency.project.dto.autorization;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
public class JwtAuthenticationResponse {
    private String token;
    private String refreshToken;
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
