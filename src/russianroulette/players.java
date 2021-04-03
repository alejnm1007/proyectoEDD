package russianroulette;

import java.util.*;

/**
 *
 * @author sweet_milkshake
 */

class players
{   
    public static String plyrNms(String first_name, String last_name)
    {
        Random generate1 = new Random();
	String[] name1 = {"John" /* John = 0 */, "Enzo" /* Enzo = 1 */, "Billy" /* Billy = 2 */, "Giorgio" /* Giorgio = 3 */, "Robert" /* Robert = 4 */ , "Tom" /* Tom = 5 */};
        first_name = name1[generate1.nextInt(6)];
		
	Random generate2 = new Random();
	String[] name2 = {"Marston" /* Marston = 0 */, "Morricone" /* Morricone = 1 */, "Kidd" /* Kidd = 2 */, "Moroder" /* Moroder = 3 */, "Redford" /* Redford = 4 */ , "Hardy" /* Hardy = 5 */};
        last_name = name2[generate2.nextInt(6)];
        
        String playerName;
        playerName = first_name + " " + last_name;
        
        return playerName;
    }
    
  
}
