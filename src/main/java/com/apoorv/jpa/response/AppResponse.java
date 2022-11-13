package com.apoorv.jpa.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Apoorv Vardhman
 * @Github Apoorv-Vardhman
 * @LinkedIN apoorv-vardhman
 */
public class AppResponse {
    public static @ResponseBody Object success(Object data,String message)
    {
        Map<String,Object> response = new HashMap<>();
        response.put("data",data);
        response.put("success",true);
        response.put("message",message);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static @ResponseBody Object created(Object data,String message)
    {
        Map<String,Object> response = new HashMap<>();
        response.put("data",data);
        response.put("success",true);
        response.put("message",message);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }

    public static @ResponseBody Object noContent(String message)
    {
        Map<String,Object> response = new HashMap<>();
        response.put("data",null);
        response.put("success",true);
        response.put("message",message);
        return new ResponseEntity<>(response,HttpStatus.NO_CONTENT);
    }

    public static @ResponseBody Object error(String message)
    {
        Map<String,Object> response = new HashMap<>();
        response.put("success",false);
        response.put("message",message);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
