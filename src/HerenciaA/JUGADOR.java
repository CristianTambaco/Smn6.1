package HerenciaA;

public class JUGADOR {

    //Atributos
    protected String nombre;
    protected int edad;
    protected String equipo;

    //Cpnstructor
    public JUGADOR(String nombre, int edad, String equipo){
        this.nombre =nombre;
        this.edad =edad;
        this.equipo =equipo;

    }

    //metodo personalizado
    public void mostrarInfo(){
        System.out.println("Datos del jugador");
        System.out.println(" Nombre: "+nombre+"\n Edad: "+edad+ "\n Equipo: "+equipo);
    }

    //herencia
    public static class Portero extends JUGADOR {
        //Atributos
        int atajadas;
        int golesRecibidos;

        public Portero(String nombre, int edad, String equipo, int atajadas, int golesRecibidos) {

            super(nombre, edad, equipo);
            this.atajadas = atajadas;
            this.golesRecibidos = golesRecibidos;
        }

        @Override


        public void mostrarInfo() {
            System.out.println("Portero: ");
            super.mostrarInfo();
            System.out.println(" Atajadas: " + atajadas + "\nGoles recibidos: " + golesRecibidos);
        }

    }


    public static class Defensa extends JUGADOR {
        //Atributos
        int bloqueos;


        public Defensa(String nombre, int edad, String equipo, int bloqueos) {

            super(nombre, edad, equipo);
            this.bloqueos = bloqueos;

        }

        @Override

        public void mostrarInfo() {
            System.out.println("Defensa: ");
            super.mostrarInfo();
            System.out.println(" Bloqueos: " + bloqueos);
        }



    }


    public static class Delantero extends JUGADOR {
        //Atributos


        public Delantero(String nombre, int edad, String equipo ) {


            super(nombre, edad, equipo);

        }

        @Override

        public void mostrarInfo() {
            System.out.println("Delantero: ");
            super.mostrarInfo();

        }



    }






    public static void main(String[] args){

        Delantero d1 = new Delantero("Denis",33,"Independiente");
        d1.mostrarInfo();
        Defensa def1 = new Defensa("Marco",23,"Argentina",2);
        def1.mostrarInfo();
        Portero por1 = new Portero("Pedro",27,"Barcelona",3,2);
        por1.mostrarInfo();


    }









}
