package com.example.viewpagerandpagefragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PageFragment extends Fragment {


    public PageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout. fragment_page , container, false);
        if(getArguments() != null && getArguments() .containsKey("img")) {
            ImageView iv = root.findViewById(R.id.imageView);
            if (iv != null) iv.setImageResource(getArguments().getInt("img"));
        }
        return root;

    }
    public static PageFragment newInstance( int image) {
        PageFragment f = new PageFragment();
        Bundle b = new Bundle();
        b.putInt("img", image);
        f.setArguments(b);

        return f;
    }

}
