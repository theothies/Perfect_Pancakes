package com.example.perfectpancakes.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.perfectpancakes.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private static TextView dia_description, dia_input, thicc_description, thicc_input, amount_description, amount_input,
                    batter_description, batter_output, egg_description, egg_output, milk_description, milk_output,
                    butter_description, butter_output, flour_description, flour_output, water_description, water_output;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        addTVtoView(root);
        return root;
    }

    public void addTVtoView(View root){
        dia_description = root.findViewById(R.id.text_diameter_description);
        dia_input = root.findViewById(R.id.text_diameter_input);
        thicc_description = root.findViewById(R.id.text_thicc_description);
        thicc_input = root.findViewById(R.id.text_thicc_input);
        amount_description = root.findViewById(R.id.text_amount_description);
        amount_input = root.findViewById(R.id.text_amount_input);
        batter_description = root.findViewById(R.id.text_batter_description);
        batter_output = root.findViewById(R.id.text_batter_result);
        egg_description = root.findViewById(R.id.text_eggs_description);
        egg_output = root.findViewById(R.id.text_eggs_result);
        milk_description = root.findViewById(R.id.text_milk_description);
        milk_output = root.findViewById(R.id.text_milk_result);
        butter_description = root.findViewById(R.id.text_butter_description);
        butter_output = root.findViewById(R.id.text_butter_result);
        flour_description = root.findViewById(R.id.text_flour_description);
        flour_output = root.findViewById(R.id.text_flour_result);
        water_description = root.findViewById(R.id.text_water_description);
        water_output = root.findViewById(R.id.text_water_result);
    }

    public static void setResults(double dia,
                                  double thic,
                                  int num,
                                  double res,
                                  double egg,
                                  double milk,
                                  double butter,
                                  double flour,
                                  double water){
        dia_input.setText(""+dia+" cm");
        thicc_input.setText(""+thic+" cm");
        amount_input.setText(""+num);
        batter_output.setText(""+res+" ml");
        egg_output.setText(""+egg);
        milk_output.setText(""+milk+" ml");
        butter_output.setText(""+butter+" g");
        flour_output.setText(""+flour+" g");
        water_output.setText(""+water+" ml");

    }
}