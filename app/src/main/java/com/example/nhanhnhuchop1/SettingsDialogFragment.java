package com.example.nhanhnhuchop1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SettingsDialogFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SettingsDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.fragment_settings_dialog, null);

        // Khởi tạo các View trong dialog
        EditText edtName = dialogView.findViewById(R.id.edtName);
        CheckBox chkOpt1 = dialogView.findViewById(R.id.chkOpt1);

        // Thiết lập nội dung dialog
        builder.setView(dialogView)
                .setTitle("Settings")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Lưu cài đặt vào SharePreferences hoặc Database
                        // Sau đó đóng dialog
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        SettingsDialogFragment.this.getDialog().cancel();
                    }
                });

        return builder.create();
    }
}
