package edu.uph.duadua.uts_daniellexandrosthhalim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        // Temukan LinearLayout dengan ID Profil
        LinearLayout button1 = findViewById(R.id.Profil);

        // Atur OnClickListener pada button1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buat Intent untuk navigasi ke kelas Riwayat
                Intent intent = new Intent(Homepage.this, Riwayat.class);

                // Mulai aktivitas Riwayat
                startActivity(intent);
            }
        });

        // Temukan LinearLayout dengan ID Ubahprofil
        LinearLayout button3 = findViewById(R.id.Ubahprofil);

        // Atur OnClickListener pada button3
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buat Intent untuk navigasi ke kelas ProfilMahasiswa
                Intent intent = new Intent(Homepage.this, ProfilMahasiswa.class);

                // Mulai aktivitas ProfilMahasiswa
                startActivity(intent);
            }
        });
    }
}
