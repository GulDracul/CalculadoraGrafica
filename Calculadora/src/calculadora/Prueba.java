
package calculadora;
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculador miCalculador=new Calculador();
        Consola miConsola=new Consola();
        int respuesta=miConsola.menuPrincipal();
        float resultado;
        
        
        miCalculador.setNumero1(miConsola.ingresarDato());
        miCalculador.setNumero2(miConsola.ingresarDato()); 
        
        switch(respuesta){
            
            case 1:
                miConsola.imprimir(miCalculador.sumar());
                break;
                
            case 2:
                miConsola.imprimir(miCalculador.restar());                
                break;
                
            
        }
        
        
        
        
        
        
    }
    
}
