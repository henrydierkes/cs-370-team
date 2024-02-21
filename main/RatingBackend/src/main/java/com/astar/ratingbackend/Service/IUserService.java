package com.astar.ratingbackend.Service;

import com.astar.ratingbackend.Entity.User;
import org.bson.types.ObjectId;

import java.util.List;

public interface IUserService {
    void insertUser(User user);

    void updateUsername(String userId, String newName);

    void updateUserEmail(String userId, String newEmail);

    void updateUserPassword(String userId, String newPassword);

    void deleteUser(String userId);

    void deleteUser(ObjectId userId);
    List<User> getAllUser();

}
