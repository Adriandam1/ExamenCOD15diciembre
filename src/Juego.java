
/**
 * Funciones y metodos utilizadas en la clase Main
 * @author adrian
 * @version v1.0
 *
 */


public class Juego {

    int aciertos;
    int numAleatorio;
    int numero;
    int intentos;
    String nombre;
    int record;

    // singleton
    private static Juego instance = null;

    public Juego() {
    }

    // singleton get instance
    public static Juego getInstance(){
        if (instance == null) {
            // desde aqui si que puedo acceder al constructor
            // porque estoy en la misma clase
            instance = new Juego();
        }
        return instance;
    }

    public Juego(int aciertos, int numAleatorio, int numero, int intentos, String nombre, int record) {
        this.aciertos = aciertos;
        this.numAleatorio = numAleatorio;
        this.numero = numero;
        this.intentos = intentos;
        this.nombre = nombre;
        this.record = record;

    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getNumAleatorio() {
        return numAleatorio;
    }

    public void setNumAleatorio(int numAleatorio) {
        this.numAleatorio = numAleatorio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    /**
     * Genera numero aleatorio
     * @return numero creado
     * v 1.0
     */
    public int generarNumAle(){

       return numero;

    }

    /**
     * Comprueba si el numero introducido por el usuario es correcto
     * @return si el numero es correcto o incorrecto
     * v 1.0
     */
    public void comprobarNumero(){

    }

    /**
     * Cuando el usuario falla el numero comprueba si es mayor o menor
     * @return mensaje indicando al usuario si el numero es mayor o menor al que a introducido
     * v 1.0
     */
    public void esMayor(){

    }
    /**
     * Comprueba si el usuario a superado el numero de intentos
     * @return mensaje de "perdiste" cuando el usuario se ha quedado sin intentos, sino vuelve a dar al usuario opcion a introducir numero
     * v 1.0
     */
    public void intentosSuperados(){

    }
    /**
     * Resetea el numero de intentos a 0 para la siguiente partida
     * @return no devuelve nada
     * v 1.0
     */
    public void resetearIntentos(){

    }
    /**
     * Cuenta el numero de aciertos en una partida
     * @return numero de aciertos en una partida
     * v 1.0
     */
    public int contarAciertos(){
        return aciertos;
    }
    /**
     * Guarda el nombre del usuario y su numero de aciertos
     * @return devuelve un print al usuario con su nombre y numero de aciertos si ha batido el record
     * v 1.0
     */
    public void guardarRecord(){

    }



}
