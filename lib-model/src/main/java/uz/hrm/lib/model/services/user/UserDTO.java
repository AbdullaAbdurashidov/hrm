package uz.hrm.lib.model.services.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UserDTO {

    private String id;
    private String fullName;
    private String username;
    private String email;
    private String password;
    private Boolean enabled;
    private Boolean accountNonLocked;
    private LocalDateTime createdAt;

}
