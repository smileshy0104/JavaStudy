package TryCatch;

// 业务逻辑异常（自定义异常）
public class LoginException extends Exception {
    /**
     * 空参构造
     */
    public LoginException() {
    }

    /**
     * @param message 表示异常提示
     */
    public LoginException(String message) {
        // 调用父类的构造方法
        super(message);
    }
}
