package eduadmit.eduadmit.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
// @Builder
@NoArgsConstructor
public class AuthenticationsRequest {
    private String email;
    private String password;
}
