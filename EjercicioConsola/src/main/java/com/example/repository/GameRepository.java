package com.example.repository;

import java.util.List;

public interface GameRepository {

	void insertWinner(int winnerNumber);

	List<Integer> getAllWinnersNumbers();
}
