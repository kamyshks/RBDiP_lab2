package lab2.kamysh.entity;

import lombok.*;
import lab2.kamysh.dto.UserDto;

import javax.persistence.*;
import lab2.kamysh.errors.ErrorMessage;
import javax.validation.constraints.NotBlank;

@Entity(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {


    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    @NotBlank(message = ErrorMessage.NOT_BLANK)
    private String name;

    @Column(name = "password", nullable = false)
    @NotBlank(message = ErrorMessage.NOT_BLANK)
    private String password;


    public UserDto mapToDTO() {
        return new UserDto(this);
    }
}