/**
 * We can declare our own data types just ints, floats and double are already
 * declared for us by Java system we use the enu keyword Followed by DataName
 * then {...one or more enum constants}
 * 
 * enum Day {SUNDAY, monday, Tuesday} Declare: Day days; days = Day.monday or
 * Days days = Day.SUNDAY
 * 
 * @author casul
 *
 */
public class DeclareEnums {

	// declare enums in top class just like statics
	enum Names {
		MARK, mike, Rae, Dennis
	};

	public static void main(String[] args) {
		
		//Assign reference to enum Names
		
		Names me;		///declare
		me = Names.MARK;		//assign
		
		//ALTERNATIVELY
		Names brother = Names.Dennis;
		
		System.out.println("My name is: " + me);
		System.out.println("My brother is: " + brother);
	}

}
