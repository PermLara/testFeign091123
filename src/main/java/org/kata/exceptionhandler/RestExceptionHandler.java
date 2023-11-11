package org.kata.exceptionhandler;

import lombok.extern.slf4j.Slf4j;
import org.kata.exception.BadRequestException;
import org.kata.exception.IndividualNotFoundException;
import org.kata.exception.ParameterNotValidException;
import org.kata.util.TimeUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;

@Slf4j
@ControllerAdvice
public class RestExceptionHandler extends DefaultHandlerExceptionResolver {
    @ExceptionHandler(ParameterNotValidException.class)
    protected ResponseEntity<String> parameterNotValidExceptionHandler(ParameterNotValidException ex){
        return ResponseEntity.status(HttpStatus.FORBIDDEN)
                .body(ex.getMessage());
    }

    @ExceptionHandler(IndividualNotFoundException.class)
    protected ResponseEntity<String> individualNotFoundExceptionHandler(IndividualNotFoundException ex){
        String msg = ex.getClass().getSimpleName() + ": " + ex.getMessage() +
                " - " +
                TimeUtils.getTime();
        log.error(msg);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(msg);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<String> handleException(BadRequestException ex) {
        String msg = ex.getClass().getSimpleName() + ": " + ex.getMessage() +
                " - " +
                TimeUtils.getTime();
        log.error(msg);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(msg);
    }

}
