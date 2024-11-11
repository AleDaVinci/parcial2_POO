
import java.util.List;

import controlador.ControladorEmpresas;
import controlador.Precarga;
import modelo.Empresa;
import vista.Menu;
public class App {
    public static void main(String[] args) throws Exception {
        // MVC - se pretende que el sistema sea con arquitectura MVC Modelo Vista Controlador. Organizado por carpetas. 
        // Modelo contendrá las clases de datos (Persona, Empleado, Cliente, Directivo, Empresa).
        // Vista se encargará de la interacción con el usuario (podría ser la consola en este caso).
        // Controlador gestionará la lógica de la aplicación y controlará el flujo entre el modelo y la vista.
               
        // Precarga es un metodo estatico, lo que permite utilizar su metodo sin necesidad de ser instanciado
        // uso un metodo para pre cargar los datos y lo guardo en cargaEmpresa
        List<Empresa> cargaEmpresa = Precarga.cargaDatos();
        ControladorEmpresas controlador = new ControladorEmpresas(cargaEmpresa);
        // Menuse encuentra en carpeta vista, se encarga de mostrar las distintas opciones de muestra de empresa, cliente, empleado, directivo
        Menu menuPrincipal = new Menu(controlador);

        // le paso a menuPrincipal los datos cargados
        menuPrincipal.mostrar(cargaEmpresa);           

    }
}
