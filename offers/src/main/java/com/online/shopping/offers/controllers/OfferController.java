package com.online.shopping.offers.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfferController {

	@GetMapping("/v1/getAll")
	public List<String> getAllOffers() {
		List<String> offersList = new ArrayList<String>();
		offersList.add("50 percent off in new connection");
		offersList.add("Summer offer get 20 percent additonal benefit");
		return offersList;
	}

}
