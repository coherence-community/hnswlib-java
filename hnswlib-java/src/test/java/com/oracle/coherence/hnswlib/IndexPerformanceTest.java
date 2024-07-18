package com.oracle.coherence.hnswlib;

import org.junit.Ignore;

@Ignore
public class IndexPerformanceTest extends AbstractPerformanceTest {

	@Override
	protected Index createIndexInstance(SpaceName spaceName, int dimensions) {
		return new Index(spaceName, dimensions);
	}
}
