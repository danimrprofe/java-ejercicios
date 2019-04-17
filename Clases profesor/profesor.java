//puedo heredar esta clase pero no puedo instanciar objetos

public abstract class Profesor extends Persona{
  private String idProfesor;

  public Profesor(){
      super(); //llamamos al constructor de la clase padre
      idProfesor="Unknown";
  }
  public Profesor(String nombre, String apellidos, int edad, String id){
    super(nombre,apellidos,edad); //llamo al constructor padre
    this.idProfesor = id;
  }

  abstract public float importeNomina();
}
