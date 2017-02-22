package modules.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/2/23.
 */
@RestController
@RequestMapping(value = "user")
public class UserController {
    @RequestMapping(value = "hello")
    public String hello() {
        return "hello world";
    }
}
