package com.springboot.katafirstapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.katafirstapp.models.BowlingGame;

@SpringBootTest
public class BowlingGameTest {

	@Autowired
	private BowlingGame game;

	@Test
	public void perfect() {
		game = new BowlingGame();
		for (int i = 0; i < 10; i++) {
			game.Strike();
		}
		game.BonusRoll(10);
		game.BonusRoll(10);
		assertEquals(300, game.Score());
	}
	
	@Test
	public void SpareFinalFrame() {
		game = new BowlingGame();
		ManyOpenFrames(10, 0, 0);
		assertEquals(0, game.Score());
	}

	@Test
	public void MissFrame() {
		game = new BowlingGame();
		ManyOpenFrames(10, 9, 0);
		assertEquals(90, game.Score());
	}

	@Test
	public void SpareIndicateFrame() {
		game = new BowlingGame();
		for(int i =0; i < 10; i++) {
			game.Spare(5, 5);
		}
		game.BonusRoll(5);
		assertEquals(150, game.Score());
	}
	
	private void ManyOpenFrames(int count, int firstBowl, int secondBowl) {
		for (int f_no = 0; f_no < count; f_no++) {
			game.OpenFrame(firstBowl, secondBowl);
		}
	}

}
