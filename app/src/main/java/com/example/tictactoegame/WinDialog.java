package com.example.tictactoegame;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class WinDialog extends Dialog {

    private String message;
    private MainActivity mainActivity;

    public WinDialog(@NonNull Context context, String message, MainActivity mainActivity)
    {
        super(context);
        this.message=message;
        this.mainActivity=mainActivity;
    }

    @Override
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.win_dialog_layout);

        TextView messageTex= findViewById(R.id.messageTex);
        Button startAgain= findViewById(R.id.startAgainBtn);

        messageTex.setText(message);

        startAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.restartMatch();
                dismiss();
            }
        });
    }
}
