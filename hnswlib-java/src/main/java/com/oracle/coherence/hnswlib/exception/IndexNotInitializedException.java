package com.oracle.coherence.hnswlib.exception;

/**
 * Exception thrown when the index reference is not initialized on the native
 * side. (the method initialize() is not called after the object instantiation)
 */
public class IndexNotInitializedException
        extends UnexpectedNativeException
    {
    }
