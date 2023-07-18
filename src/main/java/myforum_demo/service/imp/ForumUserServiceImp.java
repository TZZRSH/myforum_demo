package myforum_demo.service.imp;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import myforum_demo.dto.UserDto;
import myforum_demo.entity.User;
import myforum_demo.mapper.ForumUserMapper;
import myforum_demo.service.IForumUserService;
import myforum_demo.util.Result;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class ForumUserServiceImp extends ServiceImpl<ForumUserMapper, User> implements IForumUserService  {


    @Override
    public Result create (User user){
        LocalDateTime localDateTime = LocalDateTime.now();
        user.setCreate_day(localDateTime);
        if(countAccount_num(user.getAccount_num())>0){
            return Result.fail("已经有该账号");
        }
        //TODO
        //检测密码安全性
        return save(user)?Result.ok():Result.fail("添加失败");
    }

    @Override
    public Result update(UserDto userDto) {
        User oldUser = getById(userDto.getId());
        if(oldUser==null){
            return Result.fail("数据库中无数据");
        }
        BeanUtil.copyProperties(userDto,oldUser);
        boolean result =  updateById(oldUser);
        return result?Result.ok():Result.fail("修改失败");
    }

    @Override
    public Result delete(int id) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",id);
        int count =  count(queryWrapper);
        if(count<1){
            return Result.fail("数据库中无数据");
        }
        boolean deleteresult  =  removeById(id);
        return deleteresult?Result.ok():Result.fail("删除失败");
    }



    public int countAccount_num(String account_num){
        int result  = getBaseMapper().countAccount_num(account_num);
        return result;
    }

    public boolean checkPasswordSoft(String password){
        //TODO
        boolean result = false;
        return result;
    }



}
