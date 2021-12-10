package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.EjercicioConsolaApplication;

@Repository
public class GameRepositoryImpl implements GameRepository {

	public Logger LOG = LoggerFactory.getLogger(EjercicioConsolaApplication.class);
	private static List<Integer> winnerNumbers = new ArrayList<Integer>();

	@Override
	public void insertWinner(int winnerNumber) {
		LOG.info("Se insertó el ganador número:" + winnerNumber);
		winnerNumbers.add(winnerNumber);
	}

	@Override
	public List<Integer> getAllWinnersNumbers() {
		String ganadores = "";
		for (Integer winner : winnerNumbers) {
			ganadores = ganadores + winner + " ";
		}
		LOG.info("Los números de los ultimos ganadores en orden son: " + ganadores);
		return winnerNumbers;
	}
}
