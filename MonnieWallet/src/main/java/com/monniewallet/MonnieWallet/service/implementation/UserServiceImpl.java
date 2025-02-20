package com.monniewallet.MonnieWallet.service.implementation;

import com.monniewallet.MonnieWallet.dto.UserDTO;
import com.monniewallet.MonnieWallet.model.User;
import com.monniewallet.MonnieWallet.dtomapper.UserDTOMapper;
import com.monniewallet.MonnieWallet.repository.UserRepository;
import com.monniewallet.MonnieWallet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository<User> userRepository;
    private final UserDTOMapper userDTOMapper;

    @Override
    public UserDTO createUser(User user) {
        return UserDTOMapper.fromUser(userRepository.create(user));
    }
}
