package ar.edu.ejemplo.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionDemo {

    public static void ejecutarDemo() {
        System.out.println("=== DEMO REFLECTION ===");

        try {
            Class<Persona> clazz = Persona.class;

            System.out.println("-- Constructores de Persona --");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> c : constructors) {
                System.out.println("Constructor: " + c);
            }

            Constructor<Persona> cons = clazz.getConstructor(String.class, int.class);
            Persona p = cons.newInstance("Carlos", 30);
            System.out.println("\nInstancia creada por reflection: " + p);

            System.out.println("\n-- Modificando campo 'nombre' por reflection --");
            Field nombreField = clazz.getDeclaredField("nombre");
            nombreField.setAccessible(true); // permitir acceso a campo privado
            nombreField.set(p, "María (modificado)");
            System.out.println("Después de modificar: " + p);

            System.out.println("\n-- Invocando mostrarInfo() por reflection --");
            Method mostrarInfo = clazz.getMethod("mostrarInfo");
            mostrarInfo.invoke(p);

            System.out.println("\n-- Intento de cambiar modificador de saludar() a private (hack educativo) --");
            try {
                Method saludarMethod = clazz.getMethod("saludar");
                System.out.println("Antes: saludar.modifiers = " + saludarMethod.getModifiers() + " (public? " + Modifier.isPublic(saludarMethod.getModifiers()) + ")");

                Field modifiersField = Method.class.getDeclaredField("modifiers");
                modifiersField.setAccessible(true);
                int orig = saludarMethod.getModifiers();
                int nueva = (orig & ~Modifier.PUBLIC) | Modifier.PRIVATE;
                modifiersField.setInt(saludarMethod, nueva);

                System.out.println("Después: saludar.modifiers = " + saludarMethod.getModifiers() + " (public? " + Modifier.isPublic(saludarMethod.getModifiers()) + ", private? " + Modifier.isPrivate(saludarMethod.getModifiers()) + ")");
            } catch (NoSuchFieldException nsfe) {
                System.out.println("No se pudo cambiar modifiers via reflection: " + nsfe.getMessage());
                System.out.println("Nota: en JVM modernas este hack puede estar bloqueado por seguridad/JDK internals.");
            } catch (Exception ex) {
                System.out.println("Error al intentar cambiar modifiers: " + ex);
            }

            System.out.println("\n-- Invocando saludar() por reflection (aunque hayamos intentado cambiar modifiers) --");
            Method saludar = clazz.getMethod("saludar");
            System.out.println("saludar() -> " + saludar.invoke(p));

            System.out.println("\n-- Ejemplo con record PersonaRecord --");
            PersonaRecord pr = new PersonaRecord("Ana", 25);
            System.out.println("PersonaRecord: " + pr);
            System.out.println("PersonaRecord.nombre(): " + pr.nombre());
            System.out.println("=== FIN DEMO REFLECTION ===\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
