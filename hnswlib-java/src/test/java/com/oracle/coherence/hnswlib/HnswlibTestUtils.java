package com.oracle.coherence.hnswlib;

import java.util.Random;

public final class HnswlibTestUtils {

	public static float[] getRandomFloatArray(int dimension){
		float[] array = new float[dimension];
		Random random = new Random();
		for (int i = 0; i < dimension; i++){
			array[i] = random.nextFloat();
		}
		return array;
	}

}
