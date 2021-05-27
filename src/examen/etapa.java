package examen;

public class etapa {
    private String nombre;

    private List<tramos> tramosList;
    private int ordinal;
    private double distancia;
    private   multimedia media;


    public String getNombre) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }



    public void setMedia( Media Media) {
        this.Media = Media;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        if (distancia == 0){
            this.distancia =1;
        }else{
            this.distancia = distancia;
        }
    }

    private class tramos {
    }
}

}
        }
}
