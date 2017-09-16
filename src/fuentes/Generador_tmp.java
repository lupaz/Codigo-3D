/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuentes;

import codigo_3d.Interfaz_c3d;


/**
 *
 * @author Luis
 */
public class Generador_tmp {
    static int no_tmp=0;
    
    static int no_etq=0;
    
    static String genera_tmp(){
        no_tmp++;
        return "t"+no_tmp;
    }
    
    static String genera_etq(){
        no_etq++;
        return "L"+no_etq;
    }
}
