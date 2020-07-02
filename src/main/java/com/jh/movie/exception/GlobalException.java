package com.jh.movie.exception;

import com.jh.movie.exception.customException.HttpException;
import com.jh.movie.exception.customException.NotFundException;
import com.jh.movie.util.JsonResult;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public JsonResult handelException(HttpServletRequest request,Exception e){
        System.out.println("未知异常");
        System.out.println(request.getRequestURI());
        System.out.println(e.getMessage());
        JsonResult jr=new JsonResult();
        jr.setCode(999);
        jr.setMessage(e.getMessage());
        return jr;
    }
    @ExceptionHandler(value = HttpException.class)
    public ResponseEntity handelHttpException(HttpServletRequest request,HttpException e){
        System.out.println("已知http异常");
        System.out.println(request.getRequestURI());
        System.out.println(e.getCode());
        System.out.println(e.getHttpStatusCode());
        System.out.println(e.getMessage());
        JsonResult jr=new JsonResult();
        jr.setCode(e.getCode());
        jr.setMessage(e.getMessage());
        HttpHeaders headers=new HttpHeaders();
        //返回json数据
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("jh","222222222222");
        //返回状态码
        HttpStatus status=HttpStatus.resolve(e.getHttpStatusCode());
        ResponseEntity<JsonResult> responseEntity=new ResponseEntity<JsonResult>(jr,headers,status);
        return responseEntity;
    }
    @ExceptionHandler(value = NotFundException.class)
    public void handelNotFundException(HttpServletRequest request,NotFundException e){
        System.out.println("已知NotFund异常");
        System.out.println(request.getRequestURI());
        System.out.println(e.getCode());
        System.out.println(e.getHttpStatusCode());
        System.out.println(e.getMessage());
    }
}
