public class Practic {
    public static void main(String[] args) {
public static void main(String[] args) {
		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(120);
		temp.add(75);
		temp.add(42);
		temp.add(60);
		temp.add(110);
		temp.add(20);
		
		int sum = 0;
		for (int i = 0; i < temp.size(); i++){
		    sum = sum + temp[i];
		}
		int averageSpeed = sum / temp.size();
		System.out.println("Средняя скорость " + averageSpeed);
	}