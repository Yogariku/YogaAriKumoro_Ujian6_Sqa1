package com.juaracoding.ujian6.driver.strategies;

import com.juaracoding.ujian6.driver.strategies.Chrome;
import com.juaracoding.ujian6.driver.strategies.DriverStrategy;
import com.juaracoding.ujian6.driver.strategies.Firefox;
import com.juaracoding.ujian6.utils.Constants;

public class DriverStrategyImplementer {

	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case Constants.CHROME:
			return new Chrome();
			
		case Constants.FIREFOX:
			return new Firefox();

		default:
			return null;
		}
	}
}
