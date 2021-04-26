package com.springboot.katafirstapp.models;

import java.util.ArrayList;

public class OpenFrame extends Frame {
	
	
	public OpenFrame(int firstThrow, int secondThrow, ArrayList<Integer> bowls) {
		super(bowls);
		this.bowls.add(firstThrow);
		this.bowls.add(secondThrow);
	}
	
	@Override
	public int Score() {
		return bowls.get(startingThrow) + bowls.get(startingThrow + 1);
	}

	@Override
	protected int FrameSize() {
		return 2;
	}
}
