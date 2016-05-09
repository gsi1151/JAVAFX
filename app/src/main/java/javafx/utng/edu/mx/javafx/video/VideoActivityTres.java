package javafx.utng.edu.mx.javafx.video;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import javafx.utng.edu.mx.javafx.R;


public class VideoActivityTres extends Activity {
    private VideoView videoView;
    private MediaController mController;
    private Uri uriYouTube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_relation);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri = Uri.parse("rtsp://r3---sn-q4f7sn7l.googlevideo.com/Cj0LENy73wIaNAk4vHQ1hyyeuxMYDSANFC22eStXMOCoAUIASARgg4fPrLeyhoxWigELUjZWZ2hydlAyTncM/6C12D0A40175D50EC832B00D4697BC09038497CB.BC01656637C0C4CC7408B7BBB4A6B78E6C332A5F/yt6/1/video.3gp");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }
}