package exceptions;

public class EstadoValidacoException extends Exception{
        public EstadoValidacoException() {
            super("O estado não foi localizado");
        }
}
