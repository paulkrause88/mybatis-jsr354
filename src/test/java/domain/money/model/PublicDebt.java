package domain.money.model;

import java.time.LocalDate;
import java.util.Locale;

import javax.money.MonetaryAmount;

public class PublicDebt {
	private final Locale countryLocale;
	private final MonetaryAmount externalDebtUSD;
	private final LocalDate asOfDate;
	private final MonetaryAmount perCapitaUSD;
	private final double percentGDP;
	
	public PublicDebt(Locale country, MonetaryAmount debt, LocalDate asof, MonetaryAmount percap, double percent) {
		countryLocale = country;
		externalDebtUSD = debt;
		asOfDate = asof;
		perCapitaUSD = percap;
		percentGDP = percent;
	}

	public String getCountryCode() {
		return countryLocale.getCountry();
	}

	public MonetaryAmount getExternalDebtUSD() {
		return externalDebtUSD;
	}

	public LocalDate getAsOfDate() {
		return asOfDate;
	}

	public MonetaryAmount getPerCapitaUSD() {
		return perCapitaUSD;
	}

	public double getPercentOfGDP() {
		return percentGDP;
	}
}
