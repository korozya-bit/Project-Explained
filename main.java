public class main {
	public static void main(String[] args) {
		Sequence seq = new Sequence(1, 2);
		Sequence seq1 = Sequence.autoSequence(4, 19);

		seq.generateSequence(30);
		seq1.generateSequence(40);

		System.out.println(seq.getAn(2));
		System.out.println(seq.indexOfA(5));
		System.out.println(seq.ToString());
		System.out.println();
	}
}
