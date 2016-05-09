package javafx.utng.edu.mx.javafx.video;


import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import javafx.utng.edu.mx.javafx.R;

public class VideoActivityUno extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_jpa);
        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri = Uri.parse("rtsp://r1---sn-q4f7snz7.googlevideo.com/Cj0LENy73wIaNAnt2Oy6OG8VuxMYDSANFC2MdCtXMOCoAUIASARgg4fPrLeyhoxWigELUjZWZ2hydlAyTncM/1A4C9A6B4120CF95756DA757C699EE70EE6D321E.767FAD9C5216285A16F2F95C37526A7F92EC708C/yt6/1/video.3gp");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }
}