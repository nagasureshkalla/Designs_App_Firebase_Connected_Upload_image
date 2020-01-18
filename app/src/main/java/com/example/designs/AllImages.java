package com.example.designs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import com.example.designs.adapter.ImageAdapter;
import com.example.designs.model.Images;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.List;

public class AllImages extends AppCompatActivity {
    public static final String DATABASE_PATH_UPLOADS = "uploads";
    //recyclerview object
    private RecyclerView recyclerView;

    //adapter object
    private ImageAdapter adapter;
    private StorageReference storageReference;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference mDatabase=database.getReference(DATABASE_PATH_UPLOADS);
    //list to hold all the uploaded images
    private List<Images> uploads;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_images);


//        recyclerView = (RecyclerView) findViewById(R.id.hrecycle);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));



       // LoadImagesFireBase();
    }
//    private void  LoadImagesFireBase(){
//        recyclerView = (RecyclerView) findViewById(R.id.hrecycle);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//
//        uploads = new ArrayList<>();
//
//
//      //  mDatabase = FirebaseDatabase.getInstance().getReference(DATABASE_PATH_UPLOADS);
//
//        //adding an event listener to fetch values
//        mDatabase.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot snapshot) {
//                //dismissing the progress dialog
//
//
//                //iterating through all the values in database
//                for (DataSnapshot postSnapshot : snapshot.getChildren()) {
//                    Images upload = postSnapshot.getValue(Images.class);
//                    uploads.add(upload);
//                }
//                //creating adapter
//                adapter = new ImageAdapter(getApplicationContext(), uploads);
//
//                //adding adapter to recyclerview
//                recyclerView.setAdapter(adapter);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//                Toast.makeText(getApplicationContext(), "Failed to load all images", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//    }
}
