package pro.sky.java.course2.arraylistimpl.service;

public class ElementNotFounfException extends RuntimeException {
    public ElementNotFounfException() {
    }

    public ElementNotFounfException(String message) {
        super(message);
    }

    public ElementNotFounfException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementNotFounfException(Throwable cause) {
        super(cause);
    }

    public ElementNotFounfException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
