package daw.ed.oop1;

/**
 * Triangle class
 * @author carlos
 */
public class Triangle {
    
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.base;
        hash = 97 * hash + this.height;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Triangle other = (Triangle) obj;
        return (this.base == other.base && 
                this.height == other.height);  
    }

    @Override
    public String toString() {
        return "Triángulo{" + "base:" + base + ", altura:" + height + '}';
    }
    
    
    
}
