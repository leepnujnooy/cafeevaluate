package com.example.cafe.service;

import com.example.cafe.dto.UserDTO;
import com.example.cafe.entity.User;
import com.example.cafe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

import static com.example.cafe.entity.User.convertDTOtoUser;


//서비스 단에서는 이렇게 엔티티로 변환시켜주는 작업이 많이 일어남.
//DTO > Entity (Entity 클래스에서 이뤄짐)
//Entity > DTO (DTO 클래스에서 이뤄짐)

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    //유저 처리
    public void saveUser(UserDTO userDTO){
        userRepository.save(convertDTOtoUser(userDTO));
    }

    //유저인지 아닌지 처리
    public UserDTO isUser(UserDTO userDTO){
        Optional<User> byUserEmail = userRepository.findByEmail(userDTO.getEmail());

        if (byUserEmail.isPresent()){
            User user = byUserEmail.get();
            if(user.getPassword().equals(userDTO.getPassword())){
                UserDTO DTO = UserDTO.convertUserToDTO(user);
                return DTO;
            }
        }
        else{
            return null;
        }

        return null;

    }
}
