package br.edu.ifpb.android.snct_rec;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import br.edu.ifpb.android.aplicativonotification.R;


public class MainActivity extends Activity {
    Button button1, button2;
    EditText txtnome, txttitulo, txtnota, txtcomentarios;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(activity_main);
	}
	public void SalvarCadastro() {
        DadosDAO db = new DadosDAO(this);
        db.InserirDadosBD(txtnome.getText().toString(), txttitulo.getText().toString(), txtnota.getText().toString(), txtcomentarios.getText().toString());
        setContentView(activity_main);
    }
    public void insercao() {
        setContentView(activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                InserirDadosBD();
            }


private void InserirDadosBD() {
            }

        });
    }

    public void notificar() {
        setContentView(activity_main);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}