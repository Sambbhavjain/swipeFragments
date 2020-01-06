package com.example.mridule.swipefragments;

import android.support.v4.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mridule on 30/12/19.
 */

@RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
public class  FragmentPage extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view;
        Bundle bundle=getArguments();
        int pageNumber=bundle.getInt("pageNumber");

        view=inflater.inflate(R.layout.page_fragment_layout,container,false);
        TextView textView= (TextView ) view.findViewById(R.id.pageNumber);
        textView.setText(Integer.toString(pageNumber));
        return view;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}
