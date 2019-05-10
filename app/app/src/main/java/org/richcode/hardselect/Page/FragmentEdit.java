package org.richcode.hardselect.Page;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import org.richcode.hardselect.R;

public class FragmentEdit extends Fragment {

    EditText LeftEditQuestion;
    EditText RightEditQuestion;
    Button CompleteButton;


    public FragmentEdit() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit, container, false);
        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        LeftEditQuestion = (EditText)view.findViewById(R.id.left_edit_question);
        RightEditQuestion = (EditText)view.findViewById(R.id.right_edit_question);
        CompleteButton = (Button)view.findViewById(R.id.edit_complete_button);

        LeftEditQuestion.setMovementMethod(new ScrollingMovementMethod());
        RightEditQuestion.setMovementMethod(new ScrollingMovementMethod());

        CompleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;
    }

    public void refresh(){
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.detach(this).attach(this).commit();
    }

}