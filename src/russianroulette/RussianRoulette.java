package russianroulette;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author sweet_milkshake
 */
public class RussianRoulette 
{
    public static void main(String[] args) 
    {
        int numbPlayr;
        Scanner sc = new Scanner (System.in);
        System.out.println("Bienvenido, vaquero, al juego potencialmente mortal del momento. Introduce el numero de usuarios que participaran: ");
        System.out.println("");
        numbPlayr = sc.nextInt();
        
        if (numbPlayr >=1 && numbPlayr<=6)  
            {   
                System.out.println("");
                System.out.println("¿Asi que tendremos " + numbPlayr + " dementes participando en esta locura? Pues que triunfe el mas ¿afortunado?");
                
            } 
        
            else 
            
            {
               System.out.println("");
               System.out.println("Ingresaste un numero invalido de usuarios, compa. ¿No querias matazon hoy, pues?");
                
                
            }
        
        if (numbPlayr >=1 && numbPlayr<=6)  
        {   
            String oneRandomPlayer = null;
            String twoRandomPlayer = null;
            String threeRandomPlayer = null;
            String fourRandomPlayer = null;
            String fiveRandomPlayer = null;
            String sixRandomPlayer = null;
        
            oneRandomPlayer = players.plyrNms(oneRandomPlayer, oneRandomPlayer);
            twoRandomPlayer = players.plyrNms(twoRandomPlayer, twoRandomPlayer);
            threeRandomPlayer = players.plyrNms(threeRandomPlayer, threeRandomPlayer);
            fourRandomPlayer = players.plyrNms(fourRandomPlayer, fourRandomPlayer);
            fiveRandomPlayer = players.plyrNms(fiveRandomPlayer, fiveRandomPlayer);
            sixRandomPlayer = players.plyrNms(sixRandomPlayer, sixRandomPlayer);
        
            System.out.println("");
            System.out.println("Ahora vamos con los nombres de los vagos que participaran en este acto suicida: ");
            System.out.println("");
            switch(numbPlayr)
            {
                case 1: System.out.println("Jugador 1: " + oneRandomPlayer);
                        System.out.println("");
                        break;
            
                case 2: System.out.println("Jugador 1: " + oneRandomPlayer);
                        System.out.println("Jugador 2: " + twoRandomPlayer);
                        System.out.println("");
                        break;
                    
                case 3: System.out.println("Jugador 1: " + oneRandomPlayer);
                        System.out.println("Jugador 2: " + twoRandomPlayer);
                        System.out.println("Jugador 3: " + threeRandomPlayer);
                        System.out.println("");
                        break;
                    
                case 4: System.out.println("Jugador 1: " + oneRandomPlayer);
                        System.out.println("Jugador 2: " + twoRandomPlayer);
                        System.out.println("Jugador 3: " + threeRandomPlayer);
                        System.out.println("Jugador 4: " + fourRandomPlayer);
                        System.out.println("");
                        break;
                    
                case 5: System.out.println("Jugador 1: " + oneRandomPlayer);
                        System.out.println("Jugador 2: " + twoRandomPlayer);
                        System.out.println("Jugador 3: " + threeRandomPlayer);
                        System.out.println("Jugador 4: " + fourRandomPlayer);
                        System.out.println("Jugador 5: " + fiveRandomPlayer);
                        System.out.println("");
                        break;
            
                case 6: System.out.println("Jugador 1: " + oneRandomPlayer);
                        System.out.println("Jugador 2: " + twoRandomPlayer);
                        System.out.println("Jugador 3: " + threeRandomPlayer);
                        System.out.println("Jugador 4: " + fourRandomPlayer);
                        System.out.println("Jugador 5: " + fiveRandomPlayer);
                        System.out.println("Jugador 6: " + sixRandomPlayer);
                        System.out.println("");
                        break;
            }
            
        }
        
        else
        {
            System.out.println("");
            System.out.println("Reinicia el juego mortal, pues. Lo hiciera yo por ti, pero no me alcanzaron los dias pa´ llegar hasta alla");
            System.out.println("");
        }
    
    }
    


}
            
            
            
                
    
       
    

    
    

    
    
    
    

    
    
    
    

