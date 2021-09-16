package uz.hrm.user.service.mapper;

import org.mapstruct.Mapper;
import uz.hrm.lib.model.mapper.MapperInterface;
import uz.hrm.lib.model.services.user.UserDTO;
import uz.hrm.user.service.domain.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper extends MapperInterface<UserDTO, User> {

    UserDTO toDto(User entity);
    User toEntity(UserDTO dto);
    List<UserDTO> toDto(List<User> entityList);
    List<User> toEntity(List<UserDTO> dtoList);

}
