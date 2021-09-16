package uz.hrm.user.service.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uz.hrm.lib.model.services.user.UserDTO;
import uz.hrm.user.service.service.UserService;

@RestController
public class UserRest {

    public UserRest(UserService userService) {
        this.userService = userService;
    }

    private UserService userService;

    @PostMapping(value = "/save")
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO dto){
        return null;
    }

}
