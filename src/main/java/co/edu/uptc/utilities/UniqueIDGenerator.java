package co.edu.uptc.utilities;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UniqueIDGenerator {

    private static final int BOUND = Integer.MAX_VALUE;
    private static Set<Integer> generatedIDs = new HashSet<>();
    private static Random random = new Random();

    public static synchronized int getUniqueID() {
        int newID;
        do {
            newID = random.nextInt(BOUND);
        } while (generatedIDs.contains(newID));
        
        generatedIDs.add(newID);
        return newID;
    }
}
