
package presentation.commands;


public class Unknow extends FrontCommand{

    @Override
    public void process() {
        // Guardar en un fichero
        forward("/Unknow.jsp");
    }
    
}
