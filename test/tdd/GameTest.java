package tdd;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
	Game game;
	
	@BeforeEach
	void init() {
		game = new Game();
	}
	
	@Test
	void test_vide() {
		assertEquals(0, game.score());
	}
	
	@Test
	void test_20_0() {
		for (int i = 0 ; i<20;i++)
			game.roll(0);
		assertEquals(0, game.score());
	}
	
	@Test
	void test_20_1() {
		for (int i = 0 ; i<20;i++)
			game.roll(1);
		assertEquals(20, game.score());
	}
	
	@Test
	void test_10_1_et_10_2() {
		for (int i = 0 ; i<10;i++)
			game.roll(1); 
		for (int i = 0 ; i<10;i++)
			game.roll(2);
		assertEquals(30, game.score());
	}
	
	@Test
	void test_spare() {
		game.roll(7);
		game.roll(3);
		assertEquals(10, game.score());
		game.roll(4);
		assertEquals(18, game.score());
		for (int i = 0 ; i<17;i++)
			game.roll(0);
		assertEquals(18, game.score());
		System.out.println("Test spare ok");
	}
	
	@Test
	void test_strike() {
		game.roll(10);
		game.roll(3);
		game.roll(4);
		assertEquals(24, game.score());
		for (int i = 0 ; i<16;i++)
			game.roll(0);
		assertEquals(24, game.score());
		System.out.println("Test strike ok");
	}
}
