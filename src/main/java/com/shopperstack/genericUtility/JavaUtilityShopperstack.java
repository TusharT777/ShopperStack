package com.shopperstack.genericUtility;

import java.time.LocalDateTime;

public class JavaUtilityShopperstack {
	//Java logic for Local date and time
		public String getSystemTime() {
			return LocalDateTime.now().toString().replace(":", "-");
		}

}
