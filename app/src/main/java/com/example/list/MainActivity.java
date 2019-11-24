package com.example.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import static android.widget.LinearLayout.HORIZONTAL;
import static android.widget.LinearLayout.VERTICAL;

public class MainActivity extends AppCompatActivity  {

    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ItemData[] itemsData = new ItemData[3];
        itemsData[0] = new ItemData("Java", "https://miro.medium.com/max/4000/1*_FFpkCWD-KwQmc7oevCRBQ.jpeg");
        itemsData[1] = new ItemData("Php", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/PHP-logo.svg/1067px-PHP-logo.svg.png");
        itemsData[2] = new ItemData("Python", "https://qph.fs.quoracdn.net/main-qimg-7b0167d398e33e6075f975bf11d80e14");

        RecyclerView recyclerView = findViewById(R.id.rvLanguages);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter(itemsData);
        recyclerView.setAdapter(adapter);

        DividerItemDecoration itemDecor = new DividerItemDecoration(recyclerView.getContext(), VERTICAL);
        recyclerView.addItemDecoration(itemDecor);
    }


}
