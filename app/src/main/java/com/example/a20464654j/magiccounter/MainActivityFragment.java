package com.example.a20464654j.magiccounter;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    /* Player 1*/
    private ImageButton btnHpMasPone;
    private Button btnVenMasPone;
    private ImageButton btnHpMenPone;
    private Button btnVenMenPone;
    int hpOne = 20;
    int venOne = 0;
    private ImageButton btnRoboHpPone;

    /* Player 2 */
    private ImageButton btnHpMasPtwo;
    private ImageButton btnHpMenPtwo;
    private Button btnVenMasPtwo;
    private Button btnVenMenPtwo;
    int hpTwo = 20;
    int venTwo = 0;
    private ImageButton btnRoboHpPtwo;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista = inflater.inflate(R.layout.fragment_main, container, false);

        final TextView txtPone = (TextView) vista.findViewById( R.id.textPone );

        /* boton mas vida (hp, health points) Player One*/
        btnHpMasPone = (ImageButton) vista.findViewById( R.id.btnHpMasPone);
        btnHpMasPone.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v){
                hpOne++;
                txtPone.setText( hpOne + "/" + venOne);
            }
        });

        /* boton menos vida (hp, health points) Player One*/
        btnHpMenPone = (ImageButton) vista.findViewById( R.id.btnHpMenPone );
        btnHpMenPone.setOnClickListener( new View.OnClickListener() {
             @Override
            public void onClick( View v){
                hpOne--;
                txtPone.setText( hpOne + "/" + venOne);

            }
        });

        /* boton mas veneno Player One */
        btnVenMasPone = (Button) vista.findViewById( R.id.btnVenMasPone );
        btnVenMasPone.setOnClickListener( new View.OnClickListener() {
            @Override
             public void onClick( View v ){
                venOne++;
                txtPone.setText( hpOne + "/" + venOne );
            }

        });

        /* boton menos veneno Player One */
        btnVenMenPone = (Button) vista.findViewById( R.id.btnVenMenPone );
        btnVenMenPone.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ){
                if( venOne > 0){
                    venOne--;
                }
                txtPone.setText( hpOne + "/" + venOne);
            }

        });

        final TextView txtPtwo = (TextView) vista.findViewById( R.id.textPtwo );

        /* boton mas vida Player Two */
        btnHpMasPtwo = (ImageButton) vista.findViewById( R.id.btnHpMasPtwo );
        btnHpMasPtwo.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v){
                hpTwo++;
                txtPtwo.setText( hpTwo + "/" + venTwo );
            }
        });

        /* boton menos vida Player Two */
        btnHpMenPtwo = (ImageButton) vista.findViewById( R.id.btnHpMenPtwo);
        btnHpMenPtwo.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v){
                hpTwo--;
                txtPtwo.setText( hpTwo + "/" + venTwo );
            }
        });

        /* boton mas veneno Player Two */
        btnVenMasPtwo = (Button) vista.findViewById( R.id.btnVenMasPtwo );
        btnVenMasPtwo.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v){
                venTwo++;
                txtPtwo.setText( hpTwo + "/" + venTwo );
            }
        });

        /* boton menos veneno Player Two */
        btnVenMenPtwo = (Button) vista.findViewById( R.id.btnVenMenPtwo );
        btnVenMenPtwo.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v){
                if( venTwo > 0){
                    venTwo--;
                }
                txtPtwo.setText( hpTwo + "/" + venTwo );
            }
        });


        /* Robo vida */

        /* Robo vida de P1 a P2 */
        btnRoboHpPone = (ImageButton) vista.findViewById( R.id.btnRoboHpPone );
        btnRoboHpPone.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ){
                hpOne++;
                hpTwo--;
                txtPone.setText( hpOne + "/" + venOne );
                txtPtwo.setText( hpTwo + "/" + venTwo );
            }
        });

        /* Robo vida de P2 a P1 */
        btnRoboHpPtwo = (ImageButton) vista.findViewById( R.id.btnRoboHpPtwo );
        btnRoboHpPtwo.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ){
                hpOne--;
                hpTwo++;
                txtPone.setText( hpOne + "/" + venOne );
                txtPtwo.setText( hpTwo + "/" + venTwo );
            }
        });

        return vista;
    }

}
