package com.springboot.katafirstapp.models;

import java.util.ArrayList;

public class StrikeFrame extends Frame {

	public StrikeFrame(ArrayList<Integer> bowls) {
		super(bowls);
		bowls.add(10);
	}

	@Override
	public int Score() {
		return 10 + FirstBonusBall() + SecondBonusBall();
	}

	@Override
	protected int FrameSize() {
		return 1;
	}
}
