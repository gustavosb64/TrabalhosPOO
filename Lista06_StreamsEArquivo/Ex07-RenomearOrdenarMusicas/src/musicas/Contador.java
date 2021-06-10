package musicas;

import java.util.ArrayList;
import java.util.Arrays;

public class Contador {
	private char[] count = new char[4];

	public String countUp(int counter) {
	  count[0] = (char)((counter /1000)+'0');
	  count[1] = (char)(((counter /100) % 10)+'0');
	  count[2] = (char)(((counter /10) % 10)+'0');
	  count[3] = (char)((counter %10)+'0');
	  return String.valueOf(count);
	}
}
