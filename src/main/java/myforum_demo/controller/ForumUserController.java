package myforum_demo.controller;

import myforum_demo.dto.UserDto;
import myforum_demo.entity.User;
import myforum_demo.service.IForumUserService;
import myforum_demo.util.Result;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/user/operation")
public class ForumUserController {

    @Resource
    IForumUserService iForumUserService;

    @PostMapping(value = "/create")
    public Result create(@RequestBody User user){
        Result result =  iForumUserService.create(user);
        return result.getSuccess()?result:Result.fail(result.getErrorMsg());
    }

    @PostMapping(value = "/update")
    public Result update(@RequestBody UserDto userDto){
        Result result =iForumUserService.update(userDto);
        return result.getSuccess()?result:Result.fail(result.getErrorMsg());
    }

    @GetMapping(value = "/queryById/{id}")
    public Result queryById(@PathVariable("id") int id){
        User user = iForumUserService.getById(id);
        return Result.ok(user);
    }
    @PostMapping(value = "/queryByCondition")
    public Result queryScope(){
        return null;
    }

    @GetMapping(value = "/delete/{id}")
    public Result delete(@PathVariable("id") int id){
        Result result = iForumUserService.delete(id);
        return result.getSuccess()?result:Result.fail(result.getErrorMsg());
    }


}
