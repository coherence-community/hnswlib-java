package com.oracle.coherence.hnswlib.exception;

/**
 * General exception for errors that happened on the native implementation.
 */
public class UnexpectedNativeException
        extends RuntimeException
    {

    public UnexpectedNativeException()
        {
        }

    public UnexpectedNativeException(String message)
        {
        super(message);
        }

    }
