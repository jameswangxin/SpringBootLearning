package com.chipizz.springmvc.controller;

import com.chipizz.springmvc.dto.UserAddDTO;
import com.chipizz.springmvc.dto.UserUpdateDTO;
import org.springframework.web.bind.annotation.*;
import com.chipizz.springmvc.vo.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    /*
    * 查询用户列表
    *
    * @return 用户列表
    * */
    @GetMapping("")
    public List<UserVO> list() {
        //查询列表
        List<UserVO> result = new ArrayList<>();
        result.add(new UserVO().setId(1).setUsername("tourist"));
        result.add(new UserVO().setId(2).setUsername("petr"));
        result.add(new UserVO().setId(3).setUsername("Dmaxiya"));
        return result;
    }

    /*
    * 获得指定用户编号的用户
    *
    * @param id 用户编号
    * @return 用户
    *
    * */
    @GetMapping("/{id}")
    public UserVO get(@PathVariable("id") Integer id) {
        //查询并返回用户
        return new UserVO().setId(id).setUsername("username:" + id);
    }

    /*
    * 添加用户
    *
    * @param addDTO 添加用户信息 DTO
    * @return 添加成功的用户编号
    * */
    @PostMapping("")
    public Integer add(UserAddDTO addDTO) {
        //插入用户记录，返回编号
        Integer returnId = 1;
        return returnId; //???
    }

    /*
    * 更新指定用户编号的用户
    *
    * @param id 用户编号
    * @param updateDTO 更新用户信息 DTO
    * @return 是否修改成功
    * */
    @PutMapping("/{id}")
    public Boolean update(@PathVariable("id") Integer id, UserUpdateDTO updateDTO) {
        //将 id 设置到 updateDTO
        updateDTO.setId(id);
        //更新用户记录
        Boolean success = true;
        return success;
    }

    /*
    * 删除指定用户编号的用户
    * @param id 用户编号
    * @return 是否删除成功
    * */
    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable("id") Integer id) {
        //删除用户记录
        Boolean success = true;
        //返回是否更新成功
        return success;
    }
}
