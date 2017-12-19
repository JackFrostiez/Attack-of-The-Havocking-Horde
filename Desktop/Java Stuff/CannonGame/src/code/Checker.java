package code;

import java.util.ArrayList;

import entities.Monster;

public class Checker {

	private int _ticks;
	
	public Checker(){
		
	}
	
	public void tick(){
		if(_ticks == 30){ //1 seconds spawn time
			_ticks = 0;
		}
		_ticks += 1;
	}
	
	public void render(){
		
	}
	
	public Monster checkNearestEnemy(ArrayList<Monster> enemies){
		return enemies.get(0);
	}
}
