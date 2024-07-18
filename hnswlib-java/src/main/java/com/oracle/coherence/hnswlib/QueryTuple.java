package com.oracle.coherence.hnswlib;

/**
 * Query Tuple that represents the results of a knn query. It contains two
 * arrays: ids and coefficients.
 */
public class QueryTuple
    {

    int[] ids;

    float[] coefficients;

    QueryTuple(int k)
        {
        ids = new int[k];
        coefficients = new float[k];
        }

    public float[] getCoefficients()
        {
        return coefficients;
        }

    public int[] getIds()
        {
        return ids;
        }
    }
