import java.util.Random;
/**
 * Author: David G. Cooper
 * Purpose: Starter code for GPTree assignment.
 * Please do not edit this file or use it as a reference for 
 * earlier assignments. It is explicitly obfuscated to work
 * differently than the intended design of the earlier assignments.
 */
public class NodeFactory {
    private static Node[] currentOps;
    private static int numIndepVars;

    public static void setOps(Node[] n) {
        currentOps = n;
    }
    public static void setNumInd(int numInd) {
        numIndepVars = numInd;
    }
    public static Node getOp(Random rand) {
        int i = rand.nextInt(currentOps.length);
        return currentOps[i].copy(currentOps[i]);
    }
    public static int numOps() {
        return currentOps.length;
    }

    public static Node getTerm(Random rand) {
        int var = rand.nextInt(numIndepVars + 1) + 1;
        if (var < 2) {
            double val = rand.nextDouble();
            return new Const(val);
        } else {
            return new Variable(var-2);
        }
    }
    public int numIndep() {
        return numIndepVars;
    }

}


