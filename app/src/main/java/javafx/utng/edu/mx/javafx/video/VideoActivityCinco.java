package javafx.utng.edu.mx.javafx.video;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import javafx.utng.edu.mx.javafx.R;


public class VideoActivityCinco extends Activity {
    private VideoView videoView;
    private MediaController mController;
    private Uri uriYouTube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_primarykey);
        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri = Uri.parse("rtsp://r2---sn-q4f7sn7z.googlevideo.com/Cj0LENy73wIaNAmWlSM-cK9G1xMYDSANFC32fStXMOCoAUIASARgg4fPrLeyhoxWigELUjZWZ2hydlAyTncM/643648B0DBD8E196F87DFD719540355AB916455E.813497DCE19820AFA74025D867E7D7DF4DBE7236/yt6/1/video.3gp");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }
}