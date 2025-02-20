package com.monniewallet.MonnieWallet.repository;

import java.util.Collection;

public interface UserRepository <T extends User> {

    T create(T data);

    Collection<T> list(int page, int pageSize);

    T get(Long id);

    T update(T data);

    Boolean delete(Long id);

    Collection<T> findByRole(String role);

    <T> ScopedValue<T> findByEmail(String email);
}
