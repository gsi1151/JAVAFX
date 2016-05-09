package javafx.utng.edu.mx.javafx.video;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import javafx.utng.edu.mx.javafx.R;


public class VideoActivityDos extends Activity {
    private VideoView videoView;
    private MediaController mController;
    private Uri uriYouTube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_persisten);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri = Uri.parse("rtsp://r4---sn-q4f7sn7k.googlevideo.com/Cj0LENy73wIaNAmnVJmRghb4zhMYDSANFC2zdytXMOCoAUIASARgg4fPrLeyhoxWigELUjZWZ2hydlAyTncM/8D9AF4DB196A6147026DC7E8EA0C81EA3EE9F3F8.46800A08FF06FC5A60953282A33452CFB2F66626/yt6/1/video.3gp");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }
}