// Esta clase va a ser heredada pero no se declara como
// abstracta, puesto que se van a poder crear objetos Persona

public class Persona{

  private String nombre;
  private String apellidos;
  private int edad;

  public Persona(){
    nombre ="";
    apellidos ="";
    edad = 0;
  }
  // sobrecarga del constructor por si inicializamos
  public Persona(String nombre, String apellidos, int edad){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
  }

  public int getEdad(){ return this.edad};
  public int getNombre(){ return this.nombre};
  public int getApellidos(){ return this.apellidos};

}
