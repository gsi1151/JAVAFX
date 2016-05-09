package javafx.utng.edu.mx.javafx.video;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import javafx.utng.edu.mx.javafx.R;


public class VideoActivityUtng extends Activity {
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
        Uri uri = Uri.parse("rtsp://r15---sn-q4f7snsd.googlevideo.com/Cj0LENy73wIaNAl83WzrFeCSHBMYDSANFC06fytXMOCoAUIASARgg4fPrLeyhoxWigELUjZWZ2hydlAyTncM/121EA0A764D75D7FC700ABA525DB5B728288136E.3F01A58C4C8C66E3A39537ED0E9AABB01DD4D193/yt6/1/video.3gp");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }
}