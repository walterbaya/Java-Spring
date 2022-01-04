package com.example.service;

import java.util.List;

public interface GameService {
	void insertWinner(int winnerNumber);
	List<Integer> getAllWinnersNumbers();
}
