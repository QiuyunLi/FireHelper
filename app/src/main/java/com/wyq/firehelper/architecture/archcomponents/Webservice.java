package com.wyq.firehelper.architecture.archcomponents;

import androidx.lifecycle.LiveData;

import com.wyq.firehelper.developkit.room.entity.UserEntity;

import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Webservice {
    @GET("/users/{user}")
    LiveData<ApiResponse<UserEntity>> getUser(@Path("user") String userId);
}
