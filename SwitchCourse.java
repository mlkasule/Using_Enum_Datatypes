/**
 * How to use enums in real world situations
 * 
 * @author Mark
 *
 */
public class SwitchCourse {
	// declare a CourseMode class
	enum CourseMode {
		ONLINE, RESIDENTIAL, HYBRID
	}

	// main method
	public static void main(String[] args) {

		// assign a myCourse to hybrid
		CourseMode myCourse = CourseMode.HYBRID;

		// Use a toString method to return object
		System.out.print("Your couse is: ");
		System.out.println(myCourse);

		// using the ordinary() method to check for position or index
		System.out.println(
				"The position (index) of " + CourseMode.RESIDENTIAL + " is " + CourseMode.RESIDENTIAL.ordinal());

		// using the equals() method to compare equality
		if (myCourse.equals(CourseMode.HYBRID)) {
			System.out.println("The two words are equal");
		} else {
			System.out.println("The two words are not equal");
		}

		// using the compareTo() method to check which word's position/index greater or
		// less
		if (myCourse.compareTo(CourseMode.ONLINE) > 0) {
			System.out.println(myCourse + " is greater than " + CourseMode.ONLINE);
		} else {
			System.out.println(myCourse + " is less than " + CourseMode.ONLINE);
		}

		// Use a switch statement to loop through instances unti; it finds HYbrid
		switch (myCourse) {
		case ONLINE:
			System.out.println("You will not need to attend classes on campus.");
			break;
		case RESIDENTIAL:
			System.out.println("All of your classes will be held on campus.");
			break;
		case HYBRID:
			System.out.println("You will be required to attend one class a week on campus.");
			break;
		default:
			System.out.println("WE do not offer this mode of course delivery.");
		}
	}

}
