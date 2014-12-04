package daw.ed.oop1;

/**
 *
 * @author carlos
 */
public class Rectangle {
    private int length;
    private int width;
    
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }
    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidht() {
        return width;
    }

    public void setWidht(int widht) {
        this.width = widht;
    }

    @Override
    public String toString() {
        return "Rectángulo{" + "ancho:" + length + ", alto:" + width + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.length;
        hash = 37 * hash + this.width;
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
        final Rectangle other = (Rectangle) obj;
        return (this.length == other.length && 
                this.width == other.width);        
    }  
    
    
    
}
