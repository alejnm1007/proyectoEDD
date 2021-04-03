package russianroulette;

/**
 *
 * @author sweet_milkshake
 */

class Methods 
{
    public static int dameUnNumeroAlAzar(int minimo, int maximo) 
    {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

}
