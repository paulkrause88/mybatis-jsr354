package domain.money.model;

import java.time.LocalDate;

import javax.money.MonetaryAmount;

public class PublicDebt {
	private final String countryCode;
	private final MonetaryAmount externalDebtUSD;
	private final LocalDate asOfDate;
	private final MonetaryAmount perCapitaUSD;
	private final double percentGDP;
	
	public PublicDebt(String iso, MonetaryAmount debt, LocalDate asof, MonetaryAmount percap, double percent) {
		countryCode = iso;
		externalDebtUSD = debt;
		asOfDate = asof;
		perCapitaUSD = percap;
		percentGDP = percent;
	}

	public String getCountryCode() {
		return countryCode;
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
