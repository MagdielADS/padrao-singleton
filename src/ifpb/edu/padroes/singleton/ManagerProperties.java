/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifpb.edu.padroes.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Magdiel Ildefonso
 */
public final class ManagerProperties {
    private static ManagerProperties manager;
    private final Properties prop;
    private File file;
    
    
    private ManagerProperties(){
        file = new File("padroes.properties");
        prop = new Properties();
        try {
            prop.load(new FileInputStream(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManagerProperties.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManagerProperties.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ManagerProperties getInstance(){
        if(manager == null)
            manager = new ManagerProperties();
        
        return manager;
    }
        
    public void writeProperties(String key, String value){
        prop.setProperty(key, value);
        try {  
            prop.store(new FileOutputStream(file), null);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManagerProperties.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManagerProperties.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    public String readProperties(){
        String value = prop.toString();
        return value;
    }
}
