package domain.money.dao;

import domain.money.model.PublicDebt;

public interface PublicDebtMapper {
	PublicDebt selectMostRecent(String country);
}
