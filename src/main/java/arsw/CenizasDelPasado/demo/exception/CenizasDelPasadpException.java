package arsw.CenizasDelPasado.demo.exception;

public class CenizasDelPasadpException extends Exception{

    public static final String RoomNotExist ="Sala no existe. Ingrese una sala valida";

    public CenizasDelPasadpException(String message) {
        super(message);
    }
}
