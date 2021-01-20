import java.util.Arrays;

public class CommandLineParser {

    public void parseAndExecute(String args[]){
        System.out.print("Arguments are: ");
        Arrays.stream(args).forEach(num -> System.out.print(num + " "));
    }


}
