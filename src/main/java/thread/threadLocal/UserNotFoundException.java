package thread.threadLocal;

public class UserNotFoundException extends Exception{
    private String error;
    private Integer statusCode;

    public UserNotFoundException(String error, Integer statusCode) {
        this.error = error;
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }


    public static void main(String[] args) throws UserNotFoundException {
        if(true){
            throw new UserNotFoundException("User is no found",404);
        }
    }
}
