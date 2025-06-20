package com.example.flightapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterDTO {

    @Email(message = "邮箱格式不正确")
    @Size(min = 0, max = 50, message = "邮箱长度不能超过50个字符")
    private String email;

    @Size(min = 8, message = "密码长度不能少于8位")
    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d).+$",message = "密码必须包含字母和数字")
    private String password;

    @NotBlank(message = "FirstName不能为空")
    @Size(max = 8, message = "FirstName长度不能超过8个字符")
    private String firstName;
    @NotBlank(message = "LastName不能为空")
    @Size(max = 8, message = "LastName长度不能超过8个字符")
    private String lastName;

    @NotBlank(message = "Country不能为空")
    private String country;

    @Size(min = 0, max = 11, message = "手机号码长度不能超过11个字符")
    private String phone;
}
