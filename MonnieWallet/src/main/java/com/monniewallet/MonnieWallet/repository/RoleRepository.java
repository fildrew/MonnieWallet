package com.monniewallet.MonnieWallet.repository;

import java.util.Collection;

public interface RoleRepository <T extends Role>{

    T create(T data);

    Collection<T> List(int page, int pageSize);

    T get(Long id);

    T update(T data);

    Boolean delete(Long id);

    void addRoleToUser(Long userId, String roleName);

    Role getRoleByUserId(Long userId);

    Role getRoleByUserEmail(String email);

    void updateUerRole(Long userId, String roleName);
}
