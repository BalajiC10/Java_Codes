package com.oops.live;
import com.oops.music.Playable;
import com.oops.music.string.*;
import com.oops.music.wind.Saxophone;
public class Test {
	public static void main(String[] args) {
		Veena v = new Veena();
		Saxophone s = new Saxophone();
		Playable pv,ps;
		
		pv=new Veena();
		ps = new Saxophone();
		
		v.play();
		s.play();
		
		pv.play();
		ps.play();
		

		}
		
}
