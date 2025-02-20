package com.monniewallet.MonnieWallet.query;

public class RoleQuery {
    public static final String INSERT_ROLE_TO_USER_QUERY = "INSERT INTO userRoles(user_id, role_id) VALUES(:userId, :roleId)";
    public static final String SELECT_ROLE_BY_QUERY = "SELECT * FROM Roles WHERE name = :name";
}
