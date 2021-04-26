package com.springboot.katafirstapp.models;

import java.util.ArrayList;

public abstract class Frame {
	protected ArrayList<Integer> bowls;
    protected int startingThrow;
  
    public Frame(ArrayList<Integer> bowls) {
      this.bowls = bowls;
      this.startingThrow =  bowls.size();
    }

    abstract public int Score();
    abstract protected int FrameSize();

    protected int FirstBonusBall() {
      return bowls.get(startingThrow + FrameSize() - 1);
    }

    protected int SecondBonusBall() {
      return  bowls.get(startingThrow + FrameSize());
    }
}
