/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author aivan
 */
public class AdiosEscuelaException extends Exception {

    /**
     * Creates a new instance of <code>AdiosEscuelaException</code> without
     * detail message.
     */
    public AdiosEscuelaException() {
    }

    /**
     * Constructs an instance of <code>AdiosEscuelaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AdiosEscuelaException(String msg) {
        super(msg);
    }
}
