package domain.money.model;

import java.time.Year;
import java.util.Locale;

import javax.money.MonetaryAmount;

public class NetIntlInvstPos {
	
	private final Locale countryLocale;
	private final Year forYear;
	private final MonetaryAmount domesticProduct;
	private final MonetaryAmount netPosition;

	public NetIntlInvstPos(Locale cnty, Year year, MonetaryAmount gdp, MonetaryAmount niip) {
		countryLocale = cnty;
		forYear = year;
		domesticProduct = gdp;
		netPosition = niip;
	}

	public String getCountryCode() {
		return countryLocale.getCountry();
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
