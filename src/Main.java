public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ana", "Jimenez", "09/05/2000");
        Person person2 = new Person("Javier", "Perez", "19/04/1998");
        System.out.println("Nombre: " + person1.getNombre() + " " + person1.getApellido() + ", edad: " + person1.calcularEdad(person1.getFechaNacimiento()));
        System.out.println("Nombre: " + person2.getNombre() + " " + person2.getApellido() + ", edad: " + person2.calcularEdad(person2.getFechaNacimiento()));

        person1.setNombre("Ana María");
        person1.setApellido("Jimenez Perez");
        System.out.println("Nombre: " + person1.getNombre() + " " + person1.getApellido() + ", edad: " + person1.calcularEdad(person1.getFechaNacimiento()));

    }
}