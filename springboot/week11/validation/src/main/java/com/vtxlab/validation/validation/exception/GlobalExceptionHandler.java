package com.vtxlab.validation.validation.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.vtxlab.validation.validation.model.Payment;
import com.vtxlab.validation.validation.responses.ApiResponse;


@ControllerAdvice
public class GlobalExceptionHandler {


  public ResponseEntity<ApiResponse<Payment>> handleMethodArgumentException (
      MethodArgumentNotValidException e) {
      ApiResponse<Payment> apiResponse = ApiResponse.<Payment>builder()
      .code(e.getStatusCode().value())
      .message(e.getAllErrors().get(0).getDefaultMessage())
      .data(null)
          .build();

      return ResponseEntity.badRequest().body(apiResponse);
    }
  
}
