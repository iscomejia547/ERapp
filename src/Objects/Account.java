/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.Objects;

/**
 *
 * @author jf_me
 */
public class Account {
    private int id;
    private String name;
    private float qty;
    private CALC_TYPE type;
    public static enum CALC_TYPE{INTERNAL_CALC, EXTERNAL_CALC};

    public Account() {
    }

    public Account(int id, String name, float qty, CALC_TYPE type) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getQty() {
        return qty;
    }

    public void setQty(float qty) {
        this.qty = qty;
    }

    public CALC_TYPE getType() {
        return type;
    }

    public void setType(CALC_TYPE type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", qty=" + qty + ", type=" + type + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Float.floatToIntBits(this.qty);
        hash = 67 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Float.floatToIntBits(this.qty) != Float.floatToIntBits(other.qty)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        return true;
    }
    
}
