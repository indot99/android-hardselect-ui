package org.richcode.hardselect.Page;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.richcode.hardselect.R;

public class FragmentSearch extends Fragment {

    public FragmentSearch() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        return view;
    }

    public void refresh(){
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.detach(this).attach(this).commit();
    }

}