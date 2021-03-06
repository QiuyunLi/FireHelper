package com.wyq.firehelper.architecture.archcomponents;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;


import com.wyq.firehelper.developkit.room.entity.UserEntity;

import javax.inject.Inject;

public class UserProfileViewModel extends ViewModel {

    private LiveData<UserEntity> user;
    private UserRepository userRepository;

    @Inject
    public UserProfileViewModel(UserRepository repository) {
        this.userRepository = repository;
    }

    public void init(String userId) {
        if (user != null) {
            return;
        }
        user = userRepository.getUser(userId);
    }

    public LiveData<UserEntity> getUser() {
        return user;
    }
}
