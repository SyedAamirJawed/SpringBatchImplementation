package com.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.batch.entities.CustomerEntity;

public class CustomerProcessor implements ItemProcessor<CustomerEntity, CustomerEntity> {

	@Override
	public CustomerEntity process(CustomerEntity item) throws Exception {

		// is method ke ander apni logic likhte jo bhi condtion lagani jaise hamne niche condtion lagya hai jo customer india se sirf wahi data filter ho kar database me save ho
		
//		if (item.getCountry().equals("india")) {
//			return item;
//		}
		
		
		return item;
	}

}
