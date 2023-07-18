package myforum_demo.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private Boolean success;
    private String errorMsg;
    private Object data;
    private Long total;

    public static <T>Result<T> ok(){
        return new Result(true, null, null, null);
    }
    public static <T>Result<T> ok(T data){
        return new <T>Result<T>(true, null, data, null);
    }
    public static <T>Result<T> ok(T data, Long total){
        return new Result(true, null, data, total);
    }
    public static <T>Result<T> fail(String errorMsg){
        return new Result(false, errorMsg, null, null);
    }
}
