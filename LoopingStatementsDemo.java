public class LoopingStatementsDemo {
    public static void main (String [] args ) {
        
        
    int counter = 1;

 System.out.println("While Loop Output:");
 while (counter <= 5) {
    System.out.println("Count: " + counter);
    counter++;
}

counter = 1; // Reset counter
System.out.println("\nDo-While Loop Output:");
do {
    System.out.println("Count: " + counter);
    counter++;
} while (counter <= 5);


System.out.println("\nFor Loop Output (Even Numbers):");
for (int i = 2; i <= 10; i += 2) {
    System.out.println("Even: " + i);
}

System.out.println("\nLoop with Break and Continue:");
for (int i = 1; i <= 10; i++) {
    if (i == 7) {
        continue;
    }
    if (i > 8) {
        break;
    }
    System.out.println("Number: " + i);
}

    }
}