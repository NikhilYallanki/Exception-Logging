package cost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class EstimationOfCost {

	
	private static final Logger logger = LogManager.getLogger(EstimationOfCost.class.getName());
	
	public double estimatedCost(int type, double Area, boolean Aut) {
		
		logger.info("EstimationOfCost method: ");
		switch(type) {
		case 1:{
			if(!Aut) {
				logger.info("Standard Construct");
				return (new Standard().costIS(Area));
			}
			else {
				logger.error("Invalid option");
				return -1;
			}
		}
		case 2:{
			if(!Aut) {
				logger.info("Above Standard Construct");
				return (new AboveStandard().costIS(Area));
			}
			else {
				logger.error("Invalid option");
				return -1;
			}
		}
		case 3:{
			if(!Aut) {
				logger.info("High Standard Construct Option without the choice of Automation");
				return (new HighStandard().costIS(Area));
			}
			else {
				logger.info("Automated High Standard Construct Option with Automation");
				return (new AutomatedHighStandard().costIS(Area));
			}
		}
		}
		return -1;
	}
}
