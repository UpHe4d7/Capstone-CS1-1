import java.util.Scanner;

public class BitManager {
    String initialConfiguration;
    public BitManager(String initialConfiguration){
        this.initialConfiguration = initialConfiguration;
    }

    Scanner s = new Scanner(System.in);

    public void inital(){
        System.out.println("Welcome to Bitlandia!");
        System.out.println("Initial bit configuration: ");
        System.out.println();
        this.initialConfiguration = s.nextLine();
        if (isBinary(initialConfiguration)){
            System.out.println("Please enter a command (check <string>, change <index> <state>, or exit):");
            System.out.println();
            run();
        }else {
            System.out.println("Invalid input: Please enter a string of 1s and 0s.");
            System.out.println();
        }
    }

    public void run(){
        String command = s.nextLine();
        if(command.toLowerCase().equals("exit")){
            System.out.println("Exiting program. Goodbye!");
        }else{
            String[] line = command.split(" ");
            if(line[0].toLowerCase().equals("check") && line.length==2){
                if(line[1].length() == initialConfiguration.length() && isBinary(line[1])){
                    check(line[1]);
                }else {
                    System.out.println("Invalid input: Please enter a string of 1s and 0s.");
                    System.out.println();
                }

            }else if (line[0].toLowerCase().equals("change") && line.length==3) {
                char changeBit;
                if (line[2].toLowerCase().equals("naughty")){
                    changeBit = '1';
                    changeBit(Integer.parseInt(line[1]), changeBit);
                }else if (line[2].toLowerCase().equals("good")){
                    changeBit = '0';
                    changeBit(Integer.parseInt(line[1]), changeBit);
                }else {
                    System.out.println("Invalid argument: For change command, specify 'naughty' or 'good'.");
                    System.out.println();
                }
            }else {
                System.out.println("Invalid command. Please try again.");
                System.out.println();
            }
            run();
        }
    }

    public void check(String s){
        for (int i = 0; i<s.length(); i++){
            if (initialConfiguration.charAt(i)=='1' && s.charAt(i)=='1'){
                System.out.println("Contains Naughty Bits");
                System.out.println();
                return;
            }
        }
        System.out.println("No Naughty Bits Found");
        System.out.println();
    }


    public void changeBit(int index, char s) {
        if (index+1 <= initialConfiguration.length()&& index>=0){
            StringBuilder sb = new StringBuilder(initialConfiguration);
            sb.setCharAt(index, s);
            initialConfiguration=sb.toString();
            String state = s=='1' ? "Naughty" : "Good";
            System.out.println("Bit at index " + index + " marked as " + state);
        }else {
            System.out.println("Invalid index: Index out of bounds or not a number.");
            System.out.println();
        }
    }

    public boolean isBinary(String str){
        for (char c:str.toCharArray()){
            if (c != '0' && c != '1'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        BitManager b = new BitManager("");
        b.inital();
    }

}