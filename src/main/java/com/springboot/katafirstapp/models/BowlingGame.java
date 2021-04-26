package com.springboot.katafirstapp.models;

import java.util.ArrayList;

public class BowlingGame {

	    ArrayList<Integer> bowls;
	    ArrayList<Frame> frames;
	  
	    public BowlingGame() {
	      bowls = new ArrayList<Integer>();
	      frames = new ArrayList<Frame>();
	    }

	    public void OpenFrame(int firstThrow, int secondThrow) {
	      frames.add(new OpenFrame(firstThrow, secondThrow, bowls));
	    }

	    public void Spare(int firstThrow, int secondThrow) {
	      frames.add(new SpareFrame(firstThrow, secondThrow, bowls));
	    }

	    public void Strike() {
	      frames.add(new StrikeFrame(bowls));
	    }

	    public void BonusRoll(int roll){
	      frames.add(new BonusRoll(roll, bowls));
	    }

	    public int Score() {
	      int total = 0;
	      for(Frame frame : frames)
	        total += frame.Score();
	      return total;
	    }
	  
	}
	
