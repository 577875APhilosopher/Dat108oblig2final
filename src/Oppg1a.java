import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Oppg1a {

	public static void main(String[] args) {
		List<String> liste = Arrays.asList("10", "1", "20", "110", "21", "12");
		
		Collections.sort(liste,(a, b) -> Integer.parseInt(a)-Integer.valueOf(b));
		
		System.out.println(liste);
	}
	}
