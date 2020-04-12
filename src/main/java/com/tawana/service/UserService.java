package com.tawana.service;


import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import com.tawana.model.authentication.AuthRequest;
import com.tawana.model.authentication.ChangePassword;
import com.tawana.model.authentication.ForgotPassword;
import com.tawana.model.authentication.ProfileUpdate;
import com.tawana.model.authentication.User;


public interface UserService {
	
    ResponseEntity<?> createUser(User user);

    ResponseEntity<?> login(AuthRequest user);

    ResponseEntity<?> forgotPassword(ForgotPassword forgotPassword);

    ResponseEntity<?> changePassword(ChangePassword changePassword);
    
    ResponseEntity<?> profileImageUpdate(MultipartFile user_avatar);

    ResponseEntity<?> profileUpdate(ProfileUpdate profile_update);

    ResponseEntity<?> getPhoto(String path);
    
    ResponseEntity<?> venderVerify();
    
    ResponseEntity<?> venderRegister(String category_id,String category_name);
    
    ResponseEntity<?> notification();
    
    
    
    
    
    
    
   
    
}