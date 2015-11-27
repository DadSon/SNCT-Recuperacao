package br.edu.ifpb.android.snct_rec;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import br.edu.ifpb.android.aplicativonotification.R;


public class Notificacao extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView text = new TextView(this);
        text.setText("Notificação disparada.");
        setContentView(text);

        String tickerText = "Você recebeu uma mensagem.";
        CharSequence titulo = "Quantidade de Avaliações";
        CharSequence mensagem = ""
        CriarNotificacao(this, tickerText, titulo, mensagem, Notificacao.class);
    }
    protected void CriarNotificacao(Context context, CharSequence mensagemBarraStatus, CharSequence titulo, CharSequence mensagem, Class activity) {
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        Notification n = new Notification(R.drawable.chat, mensagemBarraStatus, System.currentTimeMillis());

        PendingIntent p = PendingIntent.getActivity(this, 0, new Intent(this, activity), 0);
        n.flags |= Notification.FLAG_AUTO_CANCEL;
        n.vibrate = new long[] { 100, 250, 100, 500 };
        nm.notify(R.string.app_name, n);
    }
}
