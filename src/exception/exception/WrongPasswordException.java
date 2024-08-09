package exception.exception;

public class WrongPasswordException extends RuntimeException {

    private String password;
    private String confirmPassword;

    public WrongPasswordException(String password) {
        super("пароль: %s некорректный".formatted(password));
        this.password = password;
    }

    public WrongPasswordException(String password, String confirmPassword) {
        super("Пароль: %s отличается от пароля: %s".formatted(password, confirmPassword));
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getPassword() {
        return password;
    }
}
