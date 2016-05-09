package javafx.utng.edu.mx.javafx;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import javafx.utng.edu.mx.javafx.acercade.AcercaDeScrollingActivity;
import javafx.utng.edu.mx.javafx.activity.EntitiesActivityFour;
import javafx.utng.edu.mx.javafx.activity.JPAActivityOne;
import javafx.utng.edu.mx.javafx.activity.PersistenActivityTwo;
import javafx.utng.edu.mx.javafx.activity.PrimaryKeyActivityFive;
import javafx.utng.edu.mx.javafx.activity.RelationActivityThree;
import javafx.utng.edu.mx.javafx.pdfgrafics.GrapicsActivity;


public class TemarioActivity extends AppCompatActivity implements View.OnClickListener {

    DatabaseHelperPoints helperPoints= new DatabaseHelperPoints(this);
    DatabaseHelper helper = new DatabaseHelper(this);

	private Button btnModulouno;
    private Button btnModuloDos;
    private Button btnModuloTres;
    private Button btnModulocuatro;
    private Button btnModulocinco;
    private Button btnProgreso;
    private Button btnCetificado;
    private Button btnSettings;
    private Button btnScrolling;
    private Button btnGames;
    private Button btnTeme;
    private TextView porcentaje;

	public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temario);

        btnModulouno = (Button) findViewById(R.id.btn_modulo_uno);
        btnModulouno.setOnClickListener(this);

        btnModuloDos = (Button) findViewById(R.id.btn_modulo_dos);
        btnModuloDos.setOnClickListener(this);

        btnModuloTres = (Button) findViewById(R.id.btn_modulo_tres);
        btnModuloTres.setOnClickListener(this);

        btnModulocuatro = (Button) findViewById(R.id.btn_modulo_cuatro);
        btnModulocuatro.setOnClickListener(this);

        btnModulocinco = (Button) findViewById(R.id.btn_modulo_cinco);
        btnModulocinco.setOnClickListener(this);

        btnProgreso = (Button) findViewById(R.id.btn_progress);
        btnProgreso.setOnClickListener(this);

        btnCetificado = (Button) findViewById(R.id.btn_certificated);
        btnCetificado.setOnClickListener(this);

        btnSettings = (Button) findViewById(R.id.btn_settings);
        btnSettings.setOnClickListener(this);

        btnScrolling = (Button) findViewById(R.id.btn_scroll);
        btnScrolling.setOnClickListener(this);

        btnGames = (Button) findViewById(R.id.btn_games);
        btnGames.setOnClickListener(this);

        btnTeme = (Button) findViewById(R.id.btn_tema);
        btnTeme.setOnClickListener(this);

        porcentaje= (TextView)findViewById(R.id.txv_porcentaje);

        int po=helperPoints.porsentajeCurso();
        porcentaje.setText("Tienes un "+po+"0% de avance");

        //CAMBIAR DE TEMA
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

        String name = helper.traerNombre();
        int lock = helperPoints.bloqueo();
        if (lock == 1) {
            Toast temp = Toast.makeText(TemarioActivity.this, "Disfruta el primer tema", Toast.LENGTH_LONG);
            temp.show();
        } else {
            if (lock == 2 && name != "") {
                btnModuloDos.setEnabled(true);

            } else {
                if (lock == 3 && name != "") {
                    btnModuloDos.setEnabled(true);
                    btnModuloTres.setEnabled(true);
                } else {
                    if (lock == 4 && name != "") {
                        btnModuloDos.setEnabled(true);
                        btnModuloTres.setEnabled(true);
                        btnModulocuatro.setEnabled(true);
                    } else {
                        if (lock == 5 && name != "") {
                            btnModuloDos.setEnabled(true);
                            btnModuloTres.setEnabled(true);
                            btnModulocuatro.setEnabled(true);
                            btnModulocinco.setEnabled(true);
                        } else {
                            if (lock == 6 && name != "") {
                                btnModuloDos.setEnabled(true);
                                btnModuloTres.setEnabled(true);
                                btnModulocuatro.setEnabled(true);
                                btnModulocinco.setEnabled(true);
                                btnCetificado.setEnabled(true);
                            } else {
                                new AlertDialog.Builder(this)
                                        .setTitle("JAVAFX")
                                        .setMessage("Es necesario registrase para continuar")
                                        .setNegativeButton(R.string.cancel, null)
                                        .setPositiveButton(R.string.aceptar, new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                Intent intent = new Intent(TemarioActivity.this, SignUp.class);
                                                startActivity(intent);
                                            }
                                        }).show();
                                }
                            }
                        }
                    }
                }
            }
        }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_modulo_uno:
                play_mp();
		        startActivity(new Intent(this, JPAActivityOne.class));
                break;
            case R.id.btn_modulo_dos:
                play_mp();
                Intent i= new Intent(this, PersistenActivityTwo.class);
                startActivity(i);
                break;
            case R.id.btn_modulo_tres:
                play_mp();
                i = new Intent(this, RelationActivityThree.class);
                startActivity(i);
                break;
            case R.id.btn_modulo_cuatro:
                play_mp();
                i = new Intent(this, EntitiesActivityFour.class);
                startActivity(i);
                break;
            case R.id.btn_modulo_cinco:
                play_mp();
                i = new Intent(this, PrimaryKeyActivityFive.class);
                startActivity(i);
                break;
            case R.id.btn_progress:
                play_mp();
                startActivity(new Intent(this, GrapicsActivity.class));
                break;
            case R.id.btn_certificated:
                play_mp();
                startActivity(new Intent(this, MapsActivity.class));
                break;
            case R.id.btn_settings:
                play_mp();
                startActivity(new Intent(this, SettingsActivity.class));
                break;
            case R.id.btn_scroll:
                play_mp();
                startActivity(new Intent(this, AcercaDeScrollingActivity.class));
                break;
            case R.id.btn_games:
                play_mp();
                startActivity(new Intent(this, GamesActivity.class));
                break;
            case R.id.btn_tema:
                play_mp();
                startActivity(new Intent(this, TemeActivity.class));
                break;
            default:
                break;
        }
    }
    private void play_mp() {
    // TODO Auto-generated method stub
    mp= MediaPlayer.create(this, R.raw.ratchetscritch);
    mp.start();
    }
}

