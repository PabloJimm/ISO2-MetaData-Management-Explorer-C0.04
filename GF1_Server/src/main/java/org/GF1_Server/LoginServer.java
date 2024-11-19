package org.GF1_Server;

public class LoginServer {

    // Simulamos una base de datos de usuarios con nombre de usuario y contraseña
    private static HashMap<String, String> usuarios = new HashMap<>();

    static {
        // Usuario y contraseña predefinidos para la simulación
        usuarios.put("usuario1", "contraseña1");
        usuarios.put("usuario2", "contraseña2");
    }

    /**
     * Método para verificar las credenciales de un usuario.
     * 
     * @param username El nombre de usuario proporcionado por el cliente.
     * @param password La contraseña proporcionada por el cliente.
     * @return true si las credenciales son correctas, false si son incorrectas.
     */
    public static boolean verificarCredenciales(String username, String password) {
        // Verifica si el nombre de usuario existe en la "base de datos" y si la contraseña es correcta
        if (usuarios.containsKey(username)) {
            return usuarios.get(username).equals(password);
        }
        return false;
    }

    /**
     * Método principal que simula el inicio de sesión de un usuario.
     * 
     * @param username El nombre de usuario proporcionado por el cliente.
     * @param password La contraseña proporcionada por el cliente.
     * @return Un mensaje indicando si el inicio de sesión fue exitoso o fallido.
     */
    public static String iniciarSesion(String username, String password) {
        if (verificarCredenciales(username, password)) {
            return "Inicio de sesión exitoso.";
        } else {
            return "Credenciales incorrectas.";
        }
    }

    public static void main(String[] args) {
        // Simulando un inicio de sesión desde el cliente
        String username = "usuario1";  // El nombre de usuario proporcionado por el cliente
        String password = "contraseña1";  // La contraseña proporcionada por el cliente

        String resultado = iniciarSesion(username, password);
        System.out.println(resultado);
    }
}