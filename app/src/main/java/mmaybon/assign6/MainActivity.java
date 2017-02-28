package mmaybon.assign6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.telephony.SmsManager;

public class MainActivity extends AppCompatActivity {

    Button call1, call2, call3, text1, text2, text3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void setupButtonClickEvents() {
        /**
         *   Set up button click event listener for the web info button for the first performance
         */
        call1 = (Button) findViewById(R.id.call1);
        call1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                @Override
                public void onClick(View v) {
                    dialContactPhone("2185443454");
                }
                private void dialContactPhone(final String phoneNumber) {
                    startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
                }




            }
        });

        call2 = (Button) findViewById(R.id.call2);
        call2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                @Override
                public void onClick(View v) {
                    dialContactPhone("2185442344");
                }
                private void dialContactPhone(final String phoneNumber) {
                    startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
                }


            }
        });

        call3 = (Button) findViewById(R.id.call3);
        call3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                @Override
                public void onClick(View v) {
                    dialContactPhone("2189423333");
                }
                private void dialContactPhone(final String phoneNumber) {
                    startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
                }


            }
        });

        text1 = (Button) findViewById(R.id.text1);
        text1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                public void buttonClick (View v)
                {
                    sendSMS("2185443454", "Hi!");
                }

            private void sendSMS(String phoneNumber, String message) {
                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(phoneNumber, null, message, null, null);
            }


        });



        text2 = (Button) findViewById(R.id.text2);
        text2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                    public void buttonClick (View v)
                    {
                        sendSMS("2185442344", "Hi!");
                    }

                private void sendSMS(String phoneNumber, String message) {
                    SmsManager sms = SmsManager.getDefault();
                    sms.sendTextMessage(phoneNumber, null, message, null, null);



            }
        });

        text3 = (Button) findViewById(R.id.text3);
        text3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                public void buttonClick (View v)
                {
                    sendSMS("2189423333", "Hi!");
                }

            private void sendSMS(String phoneNumber, String message) {
                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(phoneNumber, null, message, null, null);




            }
        });






    }
