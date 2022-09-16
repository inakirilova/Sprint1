
import static services.InputRequester.requestInput;
import static services.RequestProcessor.processRequester;

public class Main {

    public static void main(String[] args) {

    /*
    The file path is hardcoded in package common; Messages.FILE_PATH
    As a user, if you want to work with your local file
    then you need to change the common.Messages.FILE_PATH value with the path of you local file.
     **/

        System.out.println(processRequester(requestInput()));
//        maintenance.ReverseTextFile.reverseTextFile();
    }
}
