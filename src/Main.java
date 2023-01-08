public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a los ejercicios resueltos del tema 4");
        /*
        Los ejercicios será ejecutados con funciones y por lo tanto para poder
        ser evaluadas seran comentadas las convenientes llamadas, por lo tanto
        para poder ser comprobadas si funcionan solamente uno debe de eliminar
        los comandos de comentario y ejecutar las mismas
         */
    //primerEjercicio();
    //segundoEjercicio();
    //tercerEjercicio();
    //cuartoEjercicio();
    quintoEjercicio();
    }

    /**
     * Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
     * Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
     */
    public static void primerEjercicio(){
        int numeroIf=0;
        if(numeroIf<0){
            System.out.println("El numero es NEGATIVO");
        } else if (numeroIf>0) {
            System.out.printf("El numero es POSITIVO");
        }else{
            System.out.println("El numero es ZERO");
        }
    }

    /**
     * Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
     * el bloque de código que tendrá el bucle deberá:
     * Incrementar el valor de la variable en uno cada vez que se ejecute.
     * Mostrarlo por pantalla cada vez que se ejecute.
     */
    public static void segundoEjercicio(){
    int numeroWhile=-60;
    while(numeroWhile<3){
        numeroWhile++;
        System.out.println("El numero es "+numeroWhile);
        }
    }

    /**
     * Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
     */
    public static void tercerEjercicio(){
        int numeroWhile=3;
        do{
            numeroWhile++;
            System.out.println("El numero es "+numeroWhile);
        } while(numeroWhile<3);
    }
    /**
     * Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será
     * que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y
     * deberá mostrarse por pantalla
     */
    public static void cuartoEjercicio(){
        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }

    }

    /**
     * Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
     * Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación
     * en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
     */
    public static void quintoEjercicio(){
        String estacion=new String("hola");
        switch (estacion){
            case("verano"):
                System.out.println("La estacion es "+estacion);
                break;
            case("otoño"):
                System.out.println("La estacion es "+estacion);
                break;
            case("primavera"):
                System.out.println("La estacion es "+estacion);
                break;
            case("invierno"):
                System.out.println("La estacion es "+estacion);
                break;
            default:
                System.out.println("NO es una estacion por defecto");
                break;
        }
    }

}