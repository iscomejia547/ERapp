/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jf_me
 */
public class Help {
    private Map<String, Float> dv;

    public Help() {
        dv=new HashMap<>();
    }

    public Map<String, Float> getDv() {
        return dv;
    }

    public void setDv(Map<String, Float> dv) {
        this.dv = dv;
    }
    
    public static boolean noEmpty(String[] t){
        for (String s : t) {
            if(s.isEmpty() || s==null){
                return false;
            }
        }
        return true;
    }
    
    public Map<String, Float> parseDataVector(String[] t){
        
        dv.put("ventas", Float.parseFloat(t[0]));
        dv.put("pdeventa", Float.parseFloat(t[1]));
        dv.put("ivinicial", Float.parseFloat(t[2]));
        dv.put("prod", Float.parseFloat(t[3]));
        dv.put("capnormal", Float.parseFloat(t[4]));
        dv.put("cvp", Float.parseFloat(t[5]));
        dv.put("cvav", Float.parseFloat(t[6]));
        dv.put("cfp", Float.parseFloat(t[7]));
        dv.put("cfav", Float.parseFloat(t[8]));
        return dv;
    }
    
    public float[] direct(boolean flag, int n){
        float[] qty= new float[n];
        float ivfinal=(dv.get("ivinicial")+dv.get("prod")-dv.get("ventas"));
        qty[0]=dv.get("ventas")*dv.get("pdeventa");
        qty[1]=dv.get("ivinicial")*dv.get("cvp");
        qty[2]=dv.get("prod")*dv.get("cvp");
        qty[3]=qty[2]+qty[1];
        qty[4]=ivfinal*dv.get("cvp");
        qty[5]=qty[3]-qty[4];
        qty[6]=qty[0]-qty[5];
        if(flag){
            qty[7]=dv.get("cvav")*dv.get("ventas");
        }else{
            qty[7]=dv.get("cvav");
        }
        qty[8]=qty[6]-qty[7];
        qty[9]=dv.get("cfp");
        qty[10]=dv.get("cfav");
        qty[11]=qty[10]+qty[9];
        qty[12]=qty[8]-qty[11];
        return qty;
    }
    
    public float[] asborbent(boolean flag, int n){
        float[] qty= new float[n];
        float ivfinal=(dv.get("ivinicial")+dv.get("prod")-dv.get("ventas"));
        float ce=(dv.get("cfp")/dv.get("prod"))+dv.get("cvp");
        qty[0]=dv.get("ventas")*dv.get("pdeventa");
        qty[1]=dv.get("ivinicial")*ce;
        qty[2]=dv.get("prod")*ce;
        qty[3]=qty[2]+qty[1];
        qty[4]=ivfinal*ce;
        qty[5]=qty[3]-qty[4];
        qty[6]=(dv.get("capnormal")-dv.get("prod"))*ce;
        qty[7]=qty[5]+qty[6];
        qty[8]=qty[0]-qty[7];
        qty[9]=dv.get("cfav");
        if(flag){
            qty[10]=dv.get("cvav")*dv.get("ventas");
        }else{
            qty[10]=dv.get("cvav");
        }    
        qty[11]=qty[10]+qty[9];
        qty[12]=qty[8]-qty[11];
        return qty;
    }
}
