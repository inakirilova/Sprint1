import textfile_modifier.RequestInput;
import textfile_modifier.RequestProcessor;

public class Main {

    public static void main(String[] args) {

    /*
    The file path is hardcoded in package common; Messages.FILE_PATH
    As a user, if you want to work with your local file
    then you need to change the FILE_PATH value with the path of you local file.
     **/

        RequestProcessor.processInputRequest(RequestInput.requestInput());
    }
}
