
package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class UserDTO {
    private Long id;
    private String ownerName;
    @NotEmpty(message="Owner email can not be empty")
    @NotNull(message = "ownerEmail may not be null")
    @Size(min=1, max=50, message="onwer email should be betwen 1 to 50 characters")
    private String ownerEmail;
    private String phone;
    private String password;
}
