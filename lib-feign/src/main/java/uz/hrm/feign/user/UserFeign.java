package uz.hrm.feign.user;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import uz.hrm.lib.model.services.user.UserDTO;

@FeignClient(name = "zuul-gateway", path = "/user-service/user-service")
@LoadBalancerClient(name = "zuul-gateway")
public interface UserFeign {

    @PostMapping(value = "/save")
    ResponseEntity<UserDTO> save(@RequestBody UserDTO dto);

}
