package costEstimationTest;

import static org.junit.Assert.*;

import org.junit.Test;

import cost.EstimationOfCost;

public class CostEstimationTest {

	@Test
	public void test() {
		
		EstimationOfCost estimationOfCost=new EstimationOfCost();
		assertEquals(15000,estimationOfCost.estimatedCost(2,10,false),0);
		/*assertEquals(-1,estimationOfCost.estimatedCost(2,10,true),0);
		assertEquals(25000,estimationOfCost.estimatedCost(3,10,true),0);
		assertEquals(18000,estimationOfCost.estimatedCost(3,10,false),0);
		assertEquals(12000,estimationOfCost.estimatedCost(1,10,false),0);
		assertEquals(-1,estimationOfCost.estimatedCost(1,10,true),0);
		assertEquals(-1,estimationOfCost.estimatedCost(6,10,true),0);*/
		
	}

}
