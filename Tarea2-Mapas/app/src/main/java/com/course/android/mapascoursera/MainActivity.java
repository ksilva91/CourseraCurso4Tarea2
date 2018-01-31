package com.course.android.mapascoursera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity {

    ImageView iv_park, iv_stadium, iv_trekking, iv_foch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_park = findViewById(R.id.iv_park);
        iv_stadium = findViewById(R.id.iv_stadium);
        iv_trekking = findViewById(R.id.iv_trekking);
        iv_foch = findViewById(R.id.iv_foch);

        iv_park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LatLng carolinaPark = new LatLng(-0.181057, -78.484219);
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                intent.putExtra("point",carolinaPark);
                intent.putExtra("title","Parque la Carolina");
                startActivity(intent);
            }
        });

        iv_stadium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LatLng atahualpaStadium = new LatLng(-0.177473, -78.476679);
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                intent.putExtra("point",atahualpaStadium);
                intent.putExtra("title","Estadio Olimpico Atahualpa");
                startActivity(intent);
            }
        });

        iv_trekking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LatLng trekking = new LatLng(-0.192111, -78.519632);
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                intent.putExtra("point",trekking);
                intent.putExtra("title","Teléferico de Quito");
                startActivity(intent);
            }
        });

        iv_foch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LatLng fochSquare = new LatLng(-0.202890, -78.490984);
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                intent.putExtra("point",fochSquare);
                intent.putExtra("title","Plaza Foch");
                startActivity(intent);
            }
        });
    }
}
