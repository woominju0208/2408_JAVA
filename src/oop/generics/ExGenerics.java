package oop.generics;

public class ExGenerics {
    public static void main(String[] args) {
        Whale whale = new Whale();

        ResponseDTO<Whale> responseDTO = new ResponseDTO<>();
        responseDTO.setMessage("Hello World");
        responseDTO.setSuccess(true);
        responseDTO.setData(whale);

        Hamo hamo = new Hamo();

        ResponseDTO<Hamo> responseHamo = new ResponseDTO<>();
        responseHamo.setMessage("Hello World");
        responseHamo.setSuccess(true);
        responseHamo.setData(hamo);
    }
}
// 제네릭 메소드
class ResponseDTO<T> {
    private boolean success;
    private String message;
    private T data;

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class Whale {}
class Hamo {}
class Squirrel {}
