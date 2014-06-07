package domain.money.model;

import java.time.Year;

import javax.money.MonetaryAmount;

public class NetIntlInvstPos {
	
	private final String countryCode;
	private final Year forYear;
	private final MonetaryAmount domesticProduct;
	private final MonetaryAmount netPosition;

	public NetIntlInvstPos(String cnty, Year year, MonetaryAmount gdp, MonetaryAmount niip) {
		countryCode = cnty;
		forYear = year;
		domesticProduct = gdp;
		netPosition = niip;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public Year getForYear() {
		return forYear;
	}

	public MonetaryAmount getDomesticProduct() {
		return domesticProduct;
	}

	public MonetaryAmount getNetPosition() {
		return netPosition;
	}
}
