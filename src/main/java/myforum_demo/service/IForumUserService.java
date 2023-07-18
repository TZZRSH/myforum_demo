package myforum_demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import myforum_demo.dto.UserDto;
import myforum_demo.entity.User;
import myforum_demo.util.Result;

public interface IForumUserService extends IService<User> {
    Result create(User user);
    Result update(UserDto userDto);
    Result delete(int id);
}
