package uz.hrm.user.service.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id", length = 32)
    private String id;

    @Column(name = "full_name", length = 500)
    private String fullName;

    @Column(name = "username", length = 100)
    private String username;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "password", length = 255)
    private String password;

    @Column(name = "enabled")
    private Boolean enabled;

    @Column(name = "account_non_locked")
    private Boolean accountNonLocked;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @PrePersist
    private void prePersist(){
        this.createdAt = LocalDateTime.now();
    }

}
