package com.bridgeit.ipl.service;

import java.util.List;

import com.bridgeit.ipl.model.Player;

public interface PlayerService {

	void addPlayer(Player player);

	List<Player> getAllPlayerDetails(String name);

	List<Player> displayAllPlayer(int teamId);

}