package behavioral.iterator;

import behavioral.iterator.iterator.Iterator;

/**
 * Demonstrates the Iterator pattern by iterating through names.
 */
public class App {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
} 