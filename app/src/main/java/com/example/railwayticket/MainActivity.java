package com.example.railwayticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.railwayticket.Entity.RailwayTicket;

public class MainActivity extends AppCompatActivity {

    RailwayTicket  railwayTicket = new RailwayTicket("Вологда", "Санкт-Петербург",
            "10:00 1 февраля 2023 года", "12 часов", 125);

    // создание дополнительных полей для вывода на экран полученных значений
    private TextView railwayTicketOut; // поле вывода информации о билете

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// присваивание переменным активити элементов представления activity_main
        railwayTicketOut = findViewById(R.id.railwayTicketOut); // вывод информации о билете

// запонение экрана
        railwayTicketOut.setText(railwayTicket.toString());

    }

}