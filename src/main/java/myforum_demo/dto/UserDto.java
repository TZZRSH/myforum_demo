package myforum_demo.dto;

import lombok.Data;

@Data
public class UserDto {
    private Integer id;
    private String head_portrait;
    private String account_password;
    private String name;
    private String id_card;
    private String e_mail;
    private String user_phone;
}
