package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string
 *
 *  @author Fuad
 *  @version 2
 */
public class Person1 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person1(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
      if (input == null) {
        return null;
    } else if (input.length() <= 2) {
        return input;
    } else {
        String res = "";
        res = input.substring(2);
        res += input.charAt(0);
        res += input.charAt(1);
        return res;
    }

    }

	  //Person 1 put your implementation here
	  return null;
	}

}
