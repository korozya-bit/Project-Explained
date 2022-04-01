public class Sequence {
	private final int a1;
	private final int d;
	private int[] sequence = new int[]{0};

	public Sequence(int a1, int d) {
		this.a1 = a1;
		this.d = d;
	}

	public Sequence(Sequence seq) {
		this(seq.a1, seq.d);
	}

	public static Sequence autoSequence(int a1, int a2) {
		return new Sequence(a1, a2 - a1);

	}

	public void generateSequence(int length) {
		sequence = new int[length];
		sequence[0] = a1;

		for (int i = 1; i < length; i++) {
			sequence[i] = d * i + a1;
		}
	}

	public int indexOfA(int A) {
		for (int i = 0; i < sequence.length; i++) {
			if (sequence[i] == A) return i + 1;
		}
		return -1;
	}

	public String ToString() {
		StringBuilder seq = new StringBuilder();
		for (int j : sequence) {
			seq.append(j);
			seq.append(", ");
		}
		return seq.substring(0, seq.length() - 2);
	}

	public int getAn(int n) {
		return sequence[n - 1];
	}

	public boolean isEqual(Sequence seq) {
		return this.a1 == seq.a1 && this.d == seq.d;
	}
}
