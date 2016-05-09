package javafx.utng.edu.mx.javafx.galeria;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import javafx.utng.edu.mx.javafx.R;


public class GaleryJPA extends AppCompatActivity implements View.OnClickListener{



    public Button btnAnterior, btnSiguiente;
    public TextView tv;
    public ImageView imagen;
    int [] fotoId={
        R.drawable.jaguar_f_type_2015,
        R.drawable.jaguar_xe,
        R.drawable.ford_mondeo,
        R.drawable.mazda_mx5_2015,
            R.drawable.mercedes_benz_amg_gt,
            R.drawable.porsche_911_gts,
            R.drawable.volkswagen_golf_r_variant_2015,
            R.drawable.volvo_v60_crosscountry,
            R.drawable.seat_leon_st_cupra
    };
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galery_activity);

        btnAnterior = (Button) findViewById(R.id.btn_anterior);
        btnAnterior.setOnClickListener(this);

        imagen=(ImageView)findViewById(R.id.img_cambiante);
        btnSiguiente = (Button) findViewById(R.id.btn_siguiente);
        btnSiguiente.setOnClickListener(this);

        total=fotoId.length;
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        if(id== R.id.btn_anterior){
            i++;
            if(i==total)i=0;
        }
        if(id== R.id.btn_siguiente){
            i++;
            if(i==total)i=total-1;
        }
        imagen.setImageResource(fotoId[i]);
    }
}
