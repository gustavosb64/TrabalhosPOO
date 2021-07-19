package pack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Status {
	
	URGENTE(0), IMPORTANTE(1), COMUM(2), SPAM(3);
	
	private int valor;

	Status(int i) {
		this.valor = i;
	}
	
	public int getValor() {
		return valor;
	}
	
	private static final List<Status> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
	private static final int SIZE = VALUES.size();
	private static final Random RANDOM = new Random();

	public static Status randomStatus()  {
		return VALUES.get(RANDOM.nextInt(SIZE));
	}

}
