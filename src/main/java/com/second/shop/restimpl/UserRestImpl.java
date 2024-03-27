package com.second.shop.restimpl;

import com.second.shop.constants.ShopConstants;
import com.second.shop.rest.UserRest;
import com.second.shop.service.UserService;
import com.second.shop.utils.ShopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {

    @Autowired
    UserService userService;

    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try {
            return userService.signUp(requestMap);
        } catch (Exception e){
            e.printStackTrace();
        }
        return ShopUtils.getResponseEntity(ShopConstants.ERROR_MESSAGE, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
