package com.ncr.interns.codecatchers.incredicabs;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class UnscheduledReqFragment extends android.support.v4.app.Fragment {

    EditText fromDate,toDate,managerQLid,reasonForRequest,dropLocation;

    public UnscheduledReqFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_request, container,false);

        fromDate = getActivity().findViewById(R.id.text_fromDate);
        toDate = getActivity().findViewById(R.id.text_ToDate);
      //  managerQLid =


        return rootView;
    }


}
