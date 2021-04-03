package russianroulette;

/**
 *
 * @author sweet_milkshake
 */
public class RevolverO 
{
    private int recamaraQueSeAcciono;
    private int sitioDondeEstaLaBala;

    
    // Esperemos que sirva este intento de constructor, mi gente
    public RevolverO() 
    {
        recamaraQueSeAcciono = Methods.dameUnNumeroAlAzar(1, 6);
        sitioDondeEstaLaBala = Methods.dameUnNumeroAlAzar(1, 6);
    }

    
    //Hora de echar plomazos
    public boolean plomazo() 
    {
        boolean exito = false;

        if (recamaraQueSeAcciono == sitioDondeEstaLaBala) 
        {
            exito = true; // Se viene
        }

        siguiente();

        return exito;

    }

   
    public void siguiente() 
    {
        if (recamaraQueSeAcciono == 6) 
        {
            recamaraQueSeAcciono = 1; //posicion incial
        
        } 
        else 
        {
            recamaraQueSeAcciono++;
        }

    }

    public String toString() 
    {
        return "Este es el espacio que se disparo: " + recamaraQueSeAcciono + "; y en este espacio esta la bala: " + sitioDondeEstaLaBala;
    }
   
    
}
