package com.oracle.coherence.hnswlib;

/**
 * Query Tuple that represents the results of a knn query. It contains two
 * arrays: ids and coefficients.
 */
public class QueryTuple
    {
    /**
     * The identifiers of the nearest matches.
     */
    int[] ids;

    /**
     * The similarity coefficients of the nearest matches.
     */
    float[] coefficients;

    /**
     * A flag indicating whether there were no matches.
     * This only applied if querying with filters
     */
    boolean empty = false;

    /**
     * The number of actual matches (which may be less than the size of the id array).
     * This only applied if querying with filters
     */
    private int count;

    /**
     * Create a {@link QueryTuple} to hold a specified number of results.
     *
     * @param k  the number of results to hold
     */
    QueryTuple(int k)
        {
        this(new int[k]);
        }

    /**
     * Create a {@link QueryTuple} to hold the specified ids.
     *
     * @param ids the result ids
     */
    QueryTuple(int[] ids)
        {
        this.ids          = ids;
        this.coefficients = new float[ids.length];
        this.count        = ids.length;
        }

    /**
     * Return the vector ids.
     *
     * @return the vector ids
     */
    public int[] getIds()
        {
        return ids;
        }

    /**
     * Return the similarity coefficients.
     *
     * @return the similarity coefficients
     */
    public float[] getCoefficients()
        {
        return coefficients;
        }

    /**
     * Return {@code true} if there are no results.
     *
     * @return {@code true} if there are no results
     */
    public boolean empty()
        {
        return empty;
        }

    /**
     * Set the flag to indicate whther this {@link QueryTuple}
     * holds any results.
     *
     * @param empty {@code true} if there are no results
     */
    void empty(boolean empty)
        {
        this.empty = empty;
        }

    /**
     * Return the count of the results.
     *
     * @return the count of the results
     */
    public int count()
        {
        return count;
        }

    /**
     * Set the count of the results.
     *
     * @param count  the count of the results
     */
    void count(int count)
        {
        this.count = count;
        }
    }
