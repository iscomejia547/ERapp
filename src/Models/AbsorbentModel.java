/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Objects.Account;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jf_me
 */
public class AbsorbentModel {
    private final Object[] header={"Cuenta", "C1", "C2"};
    private List<Account> accounts;
    private Object[][] data;
    private String unit;

    public AbsorbentModel() {
        accounts=new ArrayList<>();
        initialize();
        unit="C$";       
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    private void initialize(){
        int i=0;Account e;
        e=new Account(++i, "Ventas", 0.0f, Account.CALC_TYPE.EXTERNAL_CALC);
        accounts.add(e);
        e=new Account(++i, "Inventario Inicial", 0.0f, Account.CALC_TYPE.INTERNAL_CALC);
        accounts.add(e);
        e=new Account(++i, "Produccion", 0.0f, Account.CALC_TYPE.INTERNAL_CALC);
        accounts.add(e);
        e=new Account(++i, "Disponible", 0.0f, Account.CALC_TYPE.INTERNAL_CALC);
        accounts.add(e);
        e=new Account(++i, "Inventario Final", 0.0f, Account.CALC_TYPE.INTERNAL_CALC);
        accounts.add(e);
        e=new Account(++i, "Costo de venta antes de variación", 0.0f, Account.CALC_TYPE.INTERNAL_CALC);
        accounts.add(e);
        e=new Account(++i, "Ajuste por Variación", 0.0f, Account.CALC_TYPE.INTERNAL_CALC);
        accounts.add(e);
        e=new Account(++i, "Costo de venta", 0.0f, Account.CALC_TYPE.EXTERNAL_CALC);
        accounts.add(e);
        e=new Account(++i, "Utilidad Bruta", 0.0f, Account.CALC_TYPE.EXTERNAL_CALC);
        accounts.add(e);
        e=new Account(++i, "Costo fijo de Admon. y Ventas", 0.0f, Account.CALC_TYPE.INTERNAL_CALC);
        accounts.add(e);
        e=new Account(++i, "Costo Variable de Admon. y Ventas", 0.0f, Account.CALC_TYPE.INTERNAL_CALC);
        accounts.add(e);
        e=new Account(++i, "Costos de operación", 0.0f, Account.CALC_TYPE.EXTERNAL_CALC);
        accounts.add(e);
        e=new Account(++i, "Utilidad Neta", 0.0f, Account.CALC_TYPE.EXTERNAL_CALC);
        accounts.add(e);
    }
    private void refreshState(){
        if(data==null){
            data=new Object[accounts.size()][3];
        }
        int j, k, i=0;
        for (Account x: accounts) {
            if(x.getType()==Account.CALC_TYPE.INTERNAL_CALC){
                k=1;j=2;
            }else{
                j=1;k=2;
            }
            data[i][0]=x.getName();
            data[i][j]="------";
            data[i][k]=String.format("%.2f"+unit, x.getQty());i++;
        }
    }
    public void updateData(float[] t){
        int i=0;
        for (Account x:accounts) {
            x.setQty(t[i]);
            i++;
        }
    }
    public DefaultTableModel getModel(){
        refreshState();
        return new DefaultTableModel(data, header);
    }
}
