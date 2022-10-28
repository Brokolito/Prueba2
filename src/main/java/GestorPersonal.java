import java.util.ArrayList;

public class GestorPersonal {
    private ArrayList<Persona> personas;

    public GestorPersonal() {
        this.personas = new ArrayList<Persona>();
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public Persona addPersona(String nombre, String apellido, String rut) {
        Persona persona = new Persona(nombre, apellido, rut);
        personas.add(persona);
        return persona;
    }

    public void addAutoPersonaEspecifica(String nombre, String apellido, String rut, String marca, String modelo,int anhoFabricacion, int precio, String idChasis,String material,String idMotor,int centrimetrosCubicos) {
        for (Persona persona : this.personas) {
            if (persona.getNombre().equals(nombre) && persona.getApellido().equals(apellido) && persona.getRut().equals(rut)) {
                persona.getAutomoviles().add(new Automovil(marca, modelo, anhoFabricacion, precio, new Motor(idMotor,centrimetrosCubicos),new Chasis(idChasis,material)));
            }
        }
    }
        public void addCorreoPersonaEspecifica(String nombre, String apellido, String rut, String correo, String distribuidor) {
            for (Persona persona : this.personas) {
                if (persona.getNombre().equals(nombre) && persona.getApellido().equals(apellido) && persona.getRut().equals(rut)) {
                    persona.getCorreos().add(new Correo(correo,distribuidor));
                }
            }
    }
    public void buscarMarca(String marca){
        for(Persona persona:this.personas){
            for(Automovil automovil:persona.getAutomoviles()){
                if(automovil.getMarca().equals(marca)){
                    System.out.println(persona);
                }
            }
        }
    }
    public void buscarNombre(String nombre){
        for(Persona persona:this.personas){
            if(persona.getNombre().equals(nombre)){
                System.out.println(persona);
            }
        }
    }
    public void buscarRut(String Rut){
        for(Persona persona:this.personas){
            if(persona.getRut().equals(Rut)){
                System.out.println(persona);
            }
        }

    }
}
