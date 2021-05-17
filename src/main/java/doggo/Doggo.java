package doggo;

public class Doggo {

	public static String comp(int input) {
		String output = "";
		for (int i = 1; i <= 100; i++) {
			if (i != input) {
				output += i;
				switch (i) {
				case 11:
					output += "th";
					output += ", ";
					break;
				case 12:
					output += "th";
					output += ", ";
					break;
				case 13:
					output += "th";
					output += ", ";
					break;
				case 100:
					output += "th";
					break;
				default:
					switch (i % 10) {
					case 1:
						output += "st";
						output += ", ";
						break;
					case 2:
						output += "nd";
						output += ", ";
						break;
					case 3:
						output += "rd";
						output += ", ";
						break;
					default:
						output += "th";
						output += ", ";
						break;
					}
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
	}

}
