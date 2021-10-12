package gitmodule;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewGitClass {
    public static void main(String[] args) throws IOException {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        exec.execute(new Runnable() {
            @Override
            public void run() {
                while(true)
                    System.out.println("i'm alive AHAHAHA!");
            }
        });
        System.in.read();
        System.exit(0);
    }
}
