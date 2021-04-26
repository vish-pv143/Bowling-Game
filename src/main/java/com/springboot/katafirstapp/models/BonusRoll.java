package com.springboot.katafirstapp.models;

import java.util.ArrayList;

public class BonusRoll extends Frame {

	
	public BonusRoll(int firstThrow, ArrayList<Integer> bowls) {
		super(bowls);
		this.bowls.add(firstThrow);
	}

	@Override
	public int Score() {
		return 0;
	}

	@Override
	protected int FrameSize() {
		return 0;
	}
}
