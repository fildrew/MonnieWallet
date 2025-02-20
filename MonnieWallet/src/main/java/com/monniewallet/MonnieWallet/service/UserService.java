package com.monniewallet.MonnieWallet.service;

import com.monniewallet.MonnieWallet.dto.UserDTO;
import com.monniewallet.MonnieWallet.model.User;

public interface UserService {
    UserDTO createUser(User user);
}
