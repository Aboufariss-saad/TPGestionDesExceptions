package Metier;

public class EntierNaturel {
    private int val;
    public EntierNaturel(int nbr) throws NombreNegativeException{
        if(nbr<0) throw new NombreNegativeException("veuillez essayer d'utiliser un nombre positif");
        val = nbr;
    }

    public int getVal(){
        return this.val;
    }

    public void setVal(int val) throws NombreNegativeException {
        if(val<0) throw new NombreNegativeException("veuillez essayer d'utiliser un nombre positif");
        this.val = val;
    }

    public void decrementer() throws NombreNegativeException{
        if(this.val<=0) throw new NombreNegativeException("la valeur ne peut plus être décrémentée");
        this.val-=1;
    }

}