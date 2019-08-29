/*
 * Author:  Ferenc Czifra
 * Created: 2019.04.19
 */
package com.tsystems.gslacloud;

/**
 * Exception causes the stopping of the stream, where the error occured.
 */
public class StreamAbortException extends RuntimeException {

    /**
     * Constructor
     * @param message the message describes the error.
     */
    public StreamAbortException(String message) {
        super(message);
    }
}
