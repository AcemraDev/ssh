package cn.unicom.cz.controller;

import cn.unicom.cz.entity.User;
import cn.unicom.cz.service.PersonService;
import cn.unicom.cz.service.UserService;
import cn.unicom.cz.service.TestService;
import cn.unicom.cz.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jxisme on 17/10/22.
 */
@Controller
public class MainController {

//    @Autowired
//    private TestService testService;
//
//    @Autowired
//    private PersonService personService;
//
//    @Autowired
//    private UserService userService;
//
//    @RequestMapping(value = "test", method = RequestMethod.GET)
//    public String test(){
////        实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
//
//        return "test";
//    }
//
//    @RequestMapping(value = "springtest", method = RequestMethod.GET)
//    public String springTest(){
//        return testService.test();
//    }
//
//
//
//    @RequestMapping(value = "savePerson", method = RequestMethod.GET)
//    @ResponseBody
//    public String savePerson(){
//        System.out.println("11111111111111111111111111111111111111111111111111111");
//        personService.savePerson();
//        return "success!";
//    }
//
//    @RequestMapping(value = "saveUser", method = RequestMethod.GET)
//    @ResponseBody
//    public String saveUser(){
//        System.out.println("11111111111111111111111111111111111111111111111111111");
//        userService.saveUser();
//        return "success!";
//    }
//
//    @RequestMapping(value = "getEasyUI", method = RequestMethod.GET)
//    public String getEasyUI(){
//        System.out.println("2222222222");
//        return "easyUI";
//    }
//
//    @RequestMapping(value = "getUsers", method = RequestMethod.POST)
//    @ResponseBody
//    public List<User> getUsers(){
//        System.out.println("33333333");
//        List<User> list = userService.findAll();
//        System.out.print(list);
//        return list;
//    }
//
//    @RequestMapping(value = "update_user/{id}", method = RequestMethod.POST)
//    @ResponseBody
//    public String getUsers(@PathVariable String id,@RequestBody byte[] bytes){
//        System.out.println("112211223333121121213312");
//        System.out.println(bytes);
//        /*return "success";*/
//        return "success";
//    }


}
