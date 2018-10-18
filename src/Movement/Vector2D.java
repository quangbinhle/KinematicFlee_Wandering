/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movement;

/**
 *
 * @author QuangBinh
 */
public class Vector2D {
    
    private float x;
    private float z;

    public Vector2D(float x, float z) {
        this.x = x;
        this.z = z;
    }

    public Vector2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector2D{" + "x=" + x + ", z=" + z + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Float.floatToIntBits(this.x);
        hash = 61 * hash + Float.floatToIntBits(this.z);
        return hash;
    }
    
    public static Vector2D addVector(Vector2D v1, Vector2D v2){
        return new Vector2D(v1.getX()+v2.getX(), v1.getZ()+v2.getZ());
    }
    
    public Vector2D addVector(Vector2D v){
        this.x += v.getX();
        this.z += v.getZ();
        return this;
    }
    
    public static Vector2D subVector(Vector2D v1, Vector2D v2){
        return new Vector2D(v1.getX()-v2.getX(), v1.getZ()-v2.getZ());
    }
    
    public Vector2D subVector(Vector2D v){
        this.x -= v.getX();
        this.z -= v.getZ();
        return this;
    }
    
    public static Vector2D mulVector(Vector2D vector2D, float constant){
        return new Vector2D(vector2D.getX()*constant, vector2D.getZ()*constant);
    }
    
    public Vector2D mulVector(float constant){
        this.x *= constant;
        this.z *= constant;
        return this;
    }
    
    public double length(){
        return Math.sqrt(this.x*this.x+this.z*this.z);
    }
    
    public void normolize(){
        double length = this.length();
        this.x/=length;
        this.z/=length;
    }
    public static void main(String[] args) {
        
    }
}
