package com.oracle.coherence.hnswlib.exception;

/**
 * Exception that represents that results could not be returned by the query.
 */
public class QueryCannotReturnResultsException
        extends UnexpectedNativeException
    {

    private static final String MESSAGE = "Probably ef or M is too small";

    public QueryCannotReturnResultsException()
        {
        super(MESSAGE);
        }

    }
