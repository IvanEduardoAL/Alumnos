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
public class MateriaNoEncontradaException extends Exception {

    /**
     * Creates a new instance of <code>MateriaNoEncontradaException</code>
     * without detail message.
     */
    public MateriaNoEncontradaException() {
    }

    /**
     * Constructs an instance of <code>MateriaNoEncontradaException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public MateriaNoEncontradaException(String msg) {
        super(msg);
    }
}
