package trabajopractico5.programacion2.Ejercicio9;

public class MainEj9 {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Julián Rivas", "OSDE");
        Profesional medico = new Profesional("Dr. Ramírez", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-10-05", "15:30", paciente, medico);

        System.out.println("Paciente: " + cita.getPaciente().getNombre() + " - Profesional: " + cita.getProfesional().getNombre());
    }
}
