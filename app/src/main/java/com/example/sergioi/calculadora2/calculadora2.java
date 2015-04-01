package com.example.sergioi.calculadora2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class calculadora2 extends ActionBarActivity {

   // @Override
    public String muestra="0";
    public Double dato1=0.0;
    public Double dato2=0.0;
    public Boolean alerta=false;
    public Byte operacion=0;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora2);
        final TextView pantalla=(TextView)findViewById(R.id.textView);
        final Button b0=(Button)findViewById(R.id.button0);
        final Button b1=(Button)findViewById(R.id.button1);
        final Button b2=(Button)findViewById(R.id.button2);
        final Button b3=(Button)findViewById(R.id.button3);
        final Button b4=(Button)findViewById(R.id.button4);
        final Button b5=(Button)findViewById(R.id.button5);
        final Button b6=(Button)findViewById(R.id.button6);
        final Button b7=(Button)findViewById(R.id.button7);
        final Button b8=(Button)findViewById(R.id.button8);
        final Button b9=(Button)findViewById(R.id.button9);
        final Button cle=(Button)findViewById(R.id.clear);
        final Button porc=(Button)findViewById(R.id.porcentaje);
        final Button produc=(Button)findViewById(R.id.producto);
        final Button men=(Button)findViewById(R.id.menos);
        final Button mas=(Button)findViewById(R.id.mas);
        final Button dot=(Button)findViewById(R.id.buttonpunto);
        final Button equ=(Button)findViewById(R.id.igual);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(muestra.equals("0"))
                {
                    muestra="0";
                    pantalla.setText("0");
                }
                if(!muestra.equals("0")) {
                    muestra = pantalla.getText() + "0";
                    pantalla.setText(muestra);
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muestra=pantalla.getText()+"1";
                pantalla.setText(muestra);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muestra=pantalla.getText()+"2";
                pantalla.setText(muestra);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muestra=pantalla.getText()+"3";
                pantalla.setText(muestra);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muestra=pantalla.getText()+"4";
                pantalla.setText(muestra);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muestra=pantalla.getText()+"5";
                pantalla.setText(muestra);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muestra=pantalla.getText()+"6";
                pantalla.setText(muestra);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muestra=pantalla.getText()+"7";
                pantalla.setText(muestra);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muestra=pantalla.getText()+"8";
                pantalla.setText(muestra);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muestra=pantalla.getText()+"9";
                pantalla.setText(muestra);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muestra=pantalla.getText()+".";
                pantalla.setText(muestra);
            }
        });
        cle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muestra=null;
                pantalla.setHint("Ingrese un numero");
                pantalla.setText(muestra);
            }
        });

        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alerta.equals(true))
                {
                    alertar();
                }
                else {
                    operacion=0;
                dato1=Double.parseDouble(pantalla.getText().toString());
                muestra=null;
                pantalla.setText(muestra);
                pantalla.setHint("Ingrese otro numero");
                alerta=true;}

            }
        });
        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(alerta.equals(true))
            {
                alertar();
            }
            else {
                operacion=1;
                dato1=Double.parseDouble(pantalla.getText().toString());
                muestra=null;
                pantalla.setText(muestra);
                pantalla.setHint("Ingrese otro numero");
                alerta=true;}

            }
        });
        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(alerta.equals(true))
                {
                    alerta=false;

                }
                dato2=Double.parseDouble(pantalla.getText().toString());
                switch (operacion)
                {
                    case 0:
                        dato2=dato1+dato2;
                        muestra=(dato2).toString();
                        pantalla.setText(muestra);
                        break;
                    case 1:
                        dato2=dato1-dato2;
                        muestra=(dato2).toString();
                        pantalla.setText(muestra);
                        break;
                    case 2:
                        dato2=dato1*dato2;
                        muestra=(dato2).toString();
                        pantalla.setText(muestra);
                        break;
                    case 3:
                        if (dato2==0.0)
                        {
                            cero();
                        }
                        else{
                        dato2=dato1/dato2;
                        muestra=(dato2).toString();
                        pantalla.setText(muestra);
                        }
                        break;
                    default:
                        break;
                }
            }
        });



    }

    public void alertar()
    {
        Toast.makeText(this,"Pulsar = para ver resultado",Toast.LENGTH_SHORT).show();
    }
    public void cero()
    {
        Toast.makeText(this,"Imposible divivir por 0",Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculadora2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
