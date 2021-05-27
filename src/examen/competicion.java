package examen;
import java.util.Date;
import java.util.List;

public class competicion {

    public class competicion<Etapa> {

        private String nombre;
        private pais pais;
        private List<Etapa> etapas;
        private double distancia ;
        private void calcDistanciaTotalUsandoEtapas;
        private void calcDistanciaDeEtapas;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public List<etapa> getEtapas() {

            return etapas;
        }

        public void setEtapas(List<competicion> preguntas) {
            this.etapas = etapas;
        }

        public double getDistancia() {
            return distancia;

        }

        public void setDistancia(double distancia) {
            if (distancia == 0){
                this.distancia = 1;

            }else{
                this.distancia = distancia;
            }
        }
        private void calcDistanciaTotalUsandoEtapas(){
            double distanciaTotal = 0;
            for(int i = 0; i<distancia.size();i++) {
                java.lang.Object distanciaTotalTotal = distancia.get(i).getPuntaje();
            }
            setDistancia();distanciaTotal);
        }
        private void calcDistanciaTotalUsandoEtapas(){
            double distancia =10/ calcDistanciaTotalUsandoEtapas.size();
            for(int i=0;i< distancia.size();i++){
                distancia.get(i).setPuntaje(distancia);

            }
            private void calcDistanciaDeEtapas (){
                for(int i = 0; i<distancia.size();i++) {
                    calcDistanciaDeEtapas= calcDistanciaDeEtapas.get(i).getPuntaje();
                }
                setDistancia(calcDistanciaDeEtapas);
            }
            private void calcDistanciaDeEtapas(){
                for(int i=0;i< calcDistanciaDeEtapas.size();i++){
                    calcDistanciaDeEtapas.get(i).setPuntaje(calcDistanciaDeEtapas);
                }




            }


        }


    }
}
