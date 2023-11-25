package com.miniproject.employeesalarymaintenance.Controller;

import com.miniproject.employeesalarymaintenance.RequestBody.LoginReqBody;
import com.miniproject.employeesalarymaintenance.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    UserService usrService;

    //LOGIN
    @GetMapping("/login")
    private Long getUserLoginId(@RequestBody LoginReqBody userReq){
        return usrService.validateUser(userReq);
    }
}
