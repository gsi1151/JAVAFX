package javafx.utng.edu.mx.javafx.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import javafx.utng.edu.mx.javafx.DatabaseHelperPoints;
import javafx.utng.edu.mx.javafx.MusicaActivity;
import javafx.utng.edu.mx.javafx.R;
import javafx.utng.edu.mx.javafx.answers.jpa.QuestionJPAActivity;
import javafx.utng.edu.mx.javafx.video.VideoActivityUno;

public class JPAActivityOne extends Activity implements View.OnClickListener{

    DatabaseHelperPoints helperPoints= new DatabaseHelperPoints(this);
    private Button btnCuest;
    private Button btnVideo;
    private Button btnAudio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_jpa_one);  //se saca porque sino se solapan

        btnCuest=(Button)findViewById(R.id.btn_custionario);
        btnCuest.setOnClickListener(this);
        btnVideo=(Button)findViewById(R.id.btn_video);
        btnVideo.setOnClickListener(this);
        btnAudio=(Button)findViewById(R.id.btn_audio);
        btnAudio.setOnClickListener(this);

        ScrollView temario=(ScrollView)findViewById(R.id.ScrollView01);
        int tema = helperPoints.tema();
        if (tema == 1) {
            temario.setBackgroundResource(R.drawable.fondo1);
        } else {
            if (tema == 2) {
                temario.setBackgroundResource(R.drawable.fondo2);
            } else {
                if (tema == 3) {
                    temario.setBackgroundResource(R.drawable.fondo3);
                } else {
                    if (tema == 4) {
                        temario.setBackgroundResource(R.drawable.fondo4);
                    }
                }
            }
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_custionario:
                Intent i= new Intent(this, QuestionJPAActivity.class);
                startActivity(i);
                System.exit(0);
                break;
            case R.id.btn_video:
                i = new Intent(this, VideoActivityUno.class);
                startActivity(i);
                break;
            case R.id.btn_audio:
                i = new Intent(this, MusicaActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}