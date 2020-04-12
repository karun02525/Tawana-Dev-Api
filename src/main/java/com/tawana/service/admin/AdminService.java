package com.tawana.service.admin;

import org.springframework.http.ResponseEntity;

import com.tawana.model.authentication.VerifyModel;

public interface AdminService {
	
    ResponseEntity<?> isVerify(VerifyModel venderModel);

    ResponseEntity<?> adminService();
}