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
public class Character {
    private float orientation;
    private Vector2D position;
    private float rotation;
    private Vector2D velocity;

    public Character() {
    }

    public Character(float orientation, Vector2D position, float rotation, Vector2D velocity) {
        this.orientation = orientation;
        this.position = position;
        this.rotation = rotation;
        this.velocity = velocity;
    }

    public float getOrientation() {
        return orientation;
    }

    public void setOrientation(float orientation) {
        this.orientation = orientation;
    }

    public Vector2D getPosition() {
        return position;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    public Vector2D getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2D velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return "Character{" + "orientation=" + orientation + ", position=" + position + ", rotation=" + rotation + ", velocity=" + velocity + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void update(KinematicOutput kinematicOutput, float time){
        this.velocity =kinematicOutput.getVelocity();
        this.rotation = kinematicOutput.getRotation();
        
        this.position.addVector(this.velocity.mulVector(time));
        this.orientation+=this.rotation*time;
    }
    
    public void applyNewOrientation(){
        if(this.velocity.length()>0)
        {
            this.orientation=(float) Math.atan2(-this.velocity.getX(),this.velocity.getZ());
        }
    }
}
