package com.vtxlab.openweather.response;

import java.util.List;

import com.vtxlab.openweather.exceptions.ApiException;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ApiResponse<T> {
  /**
   * !HttpStatus. Instead, its internal response code, controlled by enum.
   */
  private Integer code;

  /**
   * !HttpsStatus message.
   * Instead, its internal response message, controlled by enum.
   */
  private String message;

  /**
   * Able to map any type, but not primitive.
   */
  private T data;

  /**
   * Includes warning and error.
   */
  private List<Alert> alerts;

  
}
