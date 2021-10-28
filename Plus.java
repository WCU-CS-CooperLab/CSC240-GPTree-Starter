import java.util.Random;
/**
 * Author: David G. Cooper
 * Purpose: A binary operator for Addition
 * Purpose: Starter code for GPTree assignment.
 * Please do not edit this file or use it as a reference for 
 * earlier assignments. It is explicitly obfuscated to work
 * differently than the intended design of the earlier assignments.
 */
 public class Plus extends Binop {

     public Plus() {

     }

     public Plus(Plus p) {
         super(p);
     }
     /**
      * @param l the left node
      * @param r the right node
      */
    public Plus(Node l, Node r) {
        super(l, r);
    }
    /**
     * @return the result of adding
     * l + r
     */
     public double op(double l, double r) {
        return l + r;
    }

     protected char getOp() { return '+'; };
}
