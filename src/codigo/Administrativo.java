package codigo;

public class Administrativo extends Persona{
    String area;
    int numeroOficina;

    public String getArea(){
        return area;
    }
    public int getNumeroOficina(){
        return numeroOficina;
    }
    public void setArea(String area){
        this.area = area;
    }
    public void setNumeroOficina(int numeroOficina){
        this.numeroOficina = numeroOficina;
    }
    @Override
    public String toString(){
        return super.toString() + "\nArea:" + area + "\nNum. Oficina: " + numeroOficina;
    }
}
