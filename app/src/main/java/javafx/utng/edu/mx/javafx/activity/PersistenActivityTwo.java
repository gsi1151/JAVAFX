package javafx.utng.edu.mx.javafx.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import javafx.utng.edu.mx.javafx.DatabaseHelperPoints;
import javafx.utng.edu.mx.javafx.R;
import javafx.utng.edu.mx.javafx.answers.persisten.QuestionPersistenActivity;
import javafx.utng.edu.mx.javafx.video.VideoActivityDos;

public class PersistenActivityTwo extends Activity implements View.OnClickListener{

    DatabaseHelperPoints helperPoints= new DatabaseHelperPoints(this);
    private Button btnCuest;
    private Button btnVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_persisten_two);


        btnCuest=(Button)findViewById(R.id.btn_custionario);
        btnCuest.setOnClickListener(this);
        btnVideo=(Button)findViewById(R.id.btn_video);
        btnVideo.setOnClickListener(this);

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
                Intent i= new Intent(this, QuestionPersistenActivity.class);
                startActivity(i);
                System.exit(0);
                break;
            case R.id.btn_video:
                i = new Intent(this, VideoActivityDos.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }


}