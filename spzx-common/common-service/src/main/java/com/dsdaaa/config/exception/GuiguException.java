package com.dsdaaa.config.exception;


import com.dsdaaa.vo.common.ResultCodeEnum;
import lombok.Data;

/**
 * 自定义异常类:可以根据不同的业务，可以定义不同类型的异常类。
 * 推荐继承：RuntimeException
 * 为啥：业务层Spring 声明式事务  回滚策略  ： 默认 遇到RuntimeException异常自动回滚。
 */
@Data
public class GuiguException extends RuntimeException {

    private Integer code;
    private String message;
    private ResultCodeEnum resultCodeEnum;

    public GuiguException(ResultCodeEnum resultCodeEnum) {
        this.resultCodeEnum = resultCodeEnum;
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
    }
}
