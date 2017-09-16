/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuentes;

/**
 *
 * @author Luis
 */
public class Display {
  
    public String et_inicio;
    public String et_salida;
    public int tipo=0; //  1 = while , for y repeat, permiten break y continue 
   //  2 = select , no permite continue
    
   public Display(String et_ini, String et_fin, int tipo ){
       this.et_inicio=et_ini;
       this.et_salida=et_fin;
       this.tipo = tipo;
   }
}
