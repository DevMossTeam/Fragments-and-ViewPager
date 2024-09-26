package com.devmoss.fragmentsandviewpager;

import android.os.Bundle;
import androidx.fragment.app.Fragment; // Perbaiki import ini
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AboutFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Pastikan R.layout.aboutlayout sudah sesuai dengan nama file layout yang Anda buat
        return inflater.inflate(R.layout.aboutlayout, container, false);
    }
}