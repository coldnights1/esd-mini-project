package com.miniproject.employeesalarymaintenance.Service;

import com.miniproject.employeesalarymaintenance.Repository.UserRepository;
import com.miniproject.employeesalarymaintenance.RequestBody.LoginReqBody;
import com.miniproject.employeesalarymaintenance.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository usrRepo;

    public Long validateUser(LoginReqBody userReq) {
        Long userId=0L;
        User user = usrRepo.findByEmail(userReq.getEmail());
        if (user != null && user.getType().equalsIgnoreCase("user") && user.getPassword().equals(userReq.getPassword())) {
            userId = user.getId();
        }
        return userId;
    }
}
