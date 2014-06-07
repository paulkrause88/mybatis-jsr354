package domain.money.dao;

import domain.money.model.NetIntlInvstPos;

public interface NetIntlInvstPosMapper {

	NetIntlInvstPos selectMostRecent(String country);

}
