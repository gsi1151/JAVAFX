package javafx.utng.edu.mx.javafx.video;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import javafx.utng.edu.mx.javafx.R;


public class VideoActivityCuatro extends Activity {
    private VideoView videoView;
    private MediaController mController;
    private Uri uriYouTube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_jpa);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri = Uri.parse("rtsp://r2---sn-q4fl6n7l.googlevideo.com/Cj0LENy73wIaNAlTQuZOJ9I_UBMYDSANFC1ffitXMOCoAUIASARgg4fPrLeyhoxWigELUjZWZ2hydlAyTncM/95C4E43F0778761414A116D41ED6D0809A6243BF.18AB7EAD36EDD51561B2CEADAD7D209C09B4105B/yt6/1/video.3gp");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }
}