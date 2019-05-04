package com.test.vue.spirngbootvue.controller;


import com.test.vue.spirngbootvue.vo.ResponseVO;
import com.test.vue.spirngbootvue.vo.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public ResponseVO<?> getUsers() {
        ResponseVO<List<UserVO>> resp =  new ResponseVO<>();

        List<UserVO> list = new ArrayList<>();

        list.add(new UserVO("뭐야 ","010-7119-1992"));
        list.add(new UserVO("송이야 ","010-7119-1992"));
        list.add(new UserVO("송민석이다.","010-7119-1992"));

        resp.setResponse(list);

        return resp;
    }

    @GetMapping("/{id}")
    public ResponseVO<?> getUSer(@PathVariable int id) {
        ResponseVO<UserVO> resp = new ResponseVO<>();

        List<UserVO> list = new ArrayList<>();
        list.add(new UserVO("뭐야 ","010-7119-1992"));
        list.add(new UserVO("송이야 ","010-7119-1992"));
        list.add(new UserVO("송민석이다.","010-7119-1992"));

        resp.setResponse(list.get(id));
        return resp;
    }
}

