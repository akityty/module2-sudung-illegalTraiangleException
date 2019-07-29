public class IllegalTraiangleException extends Exception{
    String errorMessage;
    public IllegalTraiangleException(String inErrorMessage){
        this.errorMessage = inErrorMessage;
    }
    public String getErrorMessage(){
        return errorMessage;
    }
}
