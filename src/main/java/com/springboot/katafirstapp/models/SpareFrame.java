package com.springboot.katafirstapp.models;

import java.util.ArrayList;

public class SpareFrame extends Frame {



	public SpareFrame(int firstThrow, int secondThrow, ArrayList<Integer> bowls) {
		super(bowls);
		this.bowls.add(firstThrow);
		this.bowls.add(secondThrow);
	}

	@Override
	public int Score() {
		return 10 + FirstBonusBall();
	}

	@Override
	protected int FrameSize() {
		return 2;
	}
}
