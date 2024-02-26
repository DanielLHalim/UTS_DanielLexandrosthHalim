package edu.uph.duadua.uts_daniellexandrosthhalim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProfilMahasiswa extends AppCompatActivity {

    private EditText editStudentID, editName, editJurusan, editTahunMasuk, editKampus;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_mahasiswa);

        initializeViews();
        setupSubmitButton();
    }

    private void initializeViews() {
        editName = findViewById(R.id.Nama);
        editStudentID = findViewById(R.id.StudentID);
        editJurusan = findViewById(R.id.Jurusan);
        editTahunMasuk = findViewById(R.id.TahunMasuk);
        editKampus = findViewById(R.id.Kampus);
        submitButton = findViewById(R.id.Submit);
    }

    private void setupSubmitButton() {
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSubmitButton();
            }
        });
    }

    private void handleSubmitButton() {
        String name = editName.getText().toString();
        String studentID = editStudentID.getText().toString();
        String jurusan = editJurusan.getText().toString();
        String tahunMasuk = editTahunMasuk.getText().toString();
        String kampus = editKampus.getText().toString();

        String message = "Name: " + name + "\nStudent ID: " + studentID + "\nJurusan: " + jurusan + "\nTahun Masuk: " + tahunMasuk + "\nKampus: " + kampus;

        // Inflate the custom layout
        View toastLayout = getLayoutInflater().inflate(R.layout.custom_toast, null);

        // Set the text of the TextView in the custom layout
        TextView textView = toastLayout.findViewById(R.id.custom_toast_text);
        textView.setText(message);

        // Create and show the Toast
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastLayout);
        toast.show();

        // Create an Intent for starting MainActivity
        Intent intent = new Intent(ProfilMahasiswa.this, Homepage.class);
        // Start MainActivity
        startActivity(intent);
        // Optionally, finish this activity if you don't want it to remain in the back stack
        finish();
    }
}
