package javafx.utng.edu.mx.javafx;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import javafx.utng.edu.mx.javafx.agenda.AgendaFinalActivity;
import javafx.utng.edu.mx.javafx.estrategia.Manager;
import javafx.utng.edu.mx.javafx.galeria.GaleryJPA;
import javafx.utng.edu.mx.javafx.galeria.GaleryUTNG;
import javafx.utng.edu.mx.javafx.gato.JuegoCpu;
import javafx.utng.edu.mx.javafx.video.VideoActivityUtng;


public class GamesActivity extends AppCompatActivity implements View.OnClickListener{

    public Button btnPalabra, btnMemo,
                  btngalery,btnutng,btnagenda,btncalculadora,btngato,btnnum,btnvideo,btnradio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games_activity);

        btnMemo=(Button)findViewById(R.id.btn_memo);
        btnMemo.setOnClickListener(this);

        btnPalabra=(Button)findViewById(R.id.btn_formar);
        btnPalabra.setOnClickListener(this);

        btngalery=(Button)findViewById(R.id.btn_galery_jpa);
        btngalery.setOnClickListener(this);

        btnutng=(Button)findViewById(R.id.btn_galery_utng);
        btnutng.setOnClickListener(this);

        btnagenda=(Button)findViewById(R.id.btn_agenda);
        btnagenda.setOnClickListener(this);

        btncalculadora=(Button)findViewById(R.id.btn_calculadora);
        btncalculadora.setOnClickListener(this);

        btngato=(Button)findViewById(R.id.btn_gato);
        btngato.setOnClickListener(this);

        btnnum=(Button)findViewById(R.id.btn_num);
        btnnum.setOnClickListener(this);

        btnvideo=(Button)findViewById(R.id.btn_video);
        btnvideo.setOnClickListener(this);

        btnradio=(Button)findViewById(R.id.btn_radio);
        btnradio.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_memo:
                Intent intent = new Intent(GamesActivity.this, Manager.class);
                startActivity(intent);
                break;
            case R.id.btn_formar:
                intent = new Intent(GamesActivity.this, PreguntaEjemplo.class);
                startActivity(intent);
                break;
            case R.id.btn_galery_jpa:
                intent = new Intent(GamesActivity.this, GaleryJPA.class);
                startActivity(intent);
                break;
            case R.id.btn_galery_utng:
                intent = new Intent(GamesActivity.this, GaleryUTNG.class);
                startActivity(intent);
                break;
            case R.id.btn_agenda:
                intent = new Intent(GamesActivity.this, AgendaFinalActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_calculadora:
                intent = new Intent(GamesActivity.this, Calculadora.class);
                startActivity(intent);
                break;
            case R.id.btn_gato:
                intent = new Intent(GamesActivity.this, JuegoCpu.class);
                startActivity(intent);
                break;
            case R.id.btn_num:
                intent = new Intent(GamesActivity.this, JuegoNumero.class);
                startActivity(intent);
                break;

            case R.id.btn_video:
                intent = new Intent(GamesActivity.this, VideoActivityUtng.class);
                startActivity(intent);
                break;

            case R.id.btn_radio:
                intent = new Intent(GamesActivity.this, StreamingActivity.class);
                startActivity(intent);
                break;





        }
    }
}
