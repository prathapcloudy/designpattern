package com.adaptorpattern;

import com.diffpackage.PilotPen;

public class AdaptorPen implements Pen {

	PilotPen pp = new PilotPen();

	@Override
	public void write(String str) {
		pp.mark(str);
		
	}

}
