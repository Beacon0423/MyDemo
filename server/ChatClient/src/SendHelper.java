import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class SendHelper extends Thread{

    private OutputStream outputStream;

    public SendHelper(OutputStream outputStream, String message) {
        System.out.println(message);
        this.outputStream=outputStream;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String msg = scanner.nextLine();
        while(!msg.equals(":q")){
            try {
                outputStream.write(msg.getBytes());
                outputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            msg = scanner.nextLine();
        }
        scanner.close();
    }
}

