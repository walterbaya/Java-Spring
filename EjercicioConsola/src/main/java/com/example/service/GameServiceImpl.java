package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repository.GameRepository;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	GameRepository repo;

	@Override
	public void insertWinner(int winnerNumber) {
		repo.insertWinner(winnerNumber);
	}

	@Override
	public List<Integer> getAllWinnersNumbers() {
		return repo.getAllWinnersNumbers();
	}

}
