package myforum_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import myforum_demo.entity.User;
import org.apache.ibatis.annotations.Param;

public interface ForumUserMapper extends BaseMapper<User> {
    int  countAccount_num(@Param("account_num") String account_num);
}