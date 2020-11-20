package com.chen.control;

import com.chen.entity.User;
import com.chen.entity.VO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author cyh
 * @Date 2020/11/19 17:51
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/query1")
    public String test1() {
        return "index";

    }

    @PostMapping(value = "/query2")
    @ResponseBody
    public void test2(@RequestBody List<User> userList) {
        System.out.println(userList);
    }


    //SpringMVC 获取请求数据
    //获取基本类型参数

    @RequestMapping("/query3")
    @ResponseBody //不进行页面跳转
    public void save11(String username, int age) {
        System.out.println(username + ":" + age);
//http://localhost:8088/user/query3?username=zhangsan&age=15
    }

    //获取Pojo 参数
    @RequestMapping("/query4")
    @ResponseBody //不进行页面跳转
    public void save11(User user) {
        System.out.println(user);
        ////http://localhost:8088/user/query4?username=zhangsan&age=15
    }

    //获取数组 参数
    @RequestMapping("/query5")
    @ResponseBody //不进行页面跳转
    public void save11(String[] strs) {
        System.out.println(Arrays.asList(strs));
        //http://localhost:8088/user/query5?strs=aa&strs=bb
    }

    //获取list 参数
    @RequestMapping("/query6")
    @ResponseBody //不进行页面跳转
    public void save11(VO vo) {
        System.out.println(vo);
    }

    //参数绑定
    @RequestMapping("/query7")
    @ResponseBody //不进行页面跳转
    public void test3(@RequestParam(value = "name",required = false,defaultValue = "kejiu")String username) {
        System.out.println(username);
    }

    //RESTFUL参数
    @RequestMapping("/query8/{name}")
    @ResponseBody //不进行页面跳转
    public void test8(@PathVariable(value = "name" )String username) {
        System.out.println(username);
    }

}