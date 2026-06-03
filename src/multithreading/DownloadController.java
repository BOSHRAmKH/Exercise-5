package multithreading;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import java.util.Random;

public class DownloadController {

    @FXML private ProgressBar pb1;
    @FXML private ProgressBar pb2;
    @FXML private ProgressBar pb3;

    @FXML
    public void startDownloads() {
     
        runDownload(pb1);
        runDownload(pb2);
        runDownload(pb3);
    }

    private void runDownload(ProgressBar pb) {
        Thread thread = new Thread(() -> {
            Random random = new Random();
            for (double i = 0; i <= 1.0; i += 0.01) {
                final double progress = i;
                Platform.runLater(() -> pb.setProgress(progress));
                
                try {
                    Thread.sleep(random.nextInt(100) + 50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}