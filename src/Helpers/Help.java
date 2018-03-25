/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

/**
 *
 * @author jf_me
 */
public class Help {
    public static boolean noEmpty(String[] t){
        for (String s : t) {
            if(s.isEmpty() || s==null){
                return false;
            }
        }
        return true;
    }
    public float[] parseDataVector(String[] t){
        float[] data=new float[t.length];
        for (int i = 0; i < data.length; i++) {
            data[i]=Float.parseFloat(t[i]);
        }
        return data;
    }
    
    
}
