public class Student{
	String name;
	int[] scores;
	
	public Student(String name, int[] scores) {
		this.name = name;
		this.scores = scores;
		int sum = 0;
		for( int score: this.scores) {
		    sum += score;
		}
		int average =  sum / this.scores.length;
		System.out.println("name:" + this.name);
		System.out.println("average:" + average);
	}
}