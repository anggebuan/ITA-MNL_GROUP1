package com.oocl.allarra.SW2;

public class Draw {
		Shapes s;
		int a;
		
		public void setShape(Shapes s) {
			this.s = s;
		}
		
		public void drawMethod() {
			s.draw();
		}
		
}
