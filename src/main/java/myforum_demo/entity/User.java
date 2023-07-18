package myforum_demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@TableName(value = "my_forum_user_t")
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer  id;
    private String head_portrait;
    private String account_num;
    private String account_password;
    private String name;
    private String id_card;
    private String e_mail;
    private String user_phone;
    private LocalDateTime create_day;
    private LocalDateTime alter_day;
}
