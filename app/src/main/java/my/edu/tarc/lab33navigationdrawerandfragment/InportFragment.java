package my.edu.tarc.lab33navigationdrawerandfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InportFragment extends Fragment {
private TextView testViewMessage;

    public InportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {
        //link UI
        View v=inflater.inflate(R.layout.fragment_inport, container, false);//simiar to setcontainView


        testViewMessage=(TextView)v.findViewById(R.id.textViewMessage);
        Button buttonCamera=(Button)v.findViewById(R.id.buttonCamera);
        buttonCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //activiate camera,test camera
                testViewMessage.setText("Say Cheese~~:)");
            }
        });
        // Inflate the layout for this fragment
        return v;
    }

}
