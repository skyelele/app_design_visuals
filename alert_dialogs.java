package com.gohool.alertdialog.alertdialog;

public class MainActivity extends AppCompatActivity {

  private AlertDialog.Builder alertDialog;
  private Button showDialog;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    showDialog = (Button) findViewById(R.id.showDialogID);
    showDialog.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        alertDialog = new AlertDialog.Builder(MainActivity.this);

        alertDialog.setTitle(getResources().getString(R.string.title));

        alertDialog.setIcon(android.R.drawable.btn_star_big_on);

        alertDialog.setMessage(getResources.getString(R.string.message));

        alertDialog.setCancelable(false);

        alertDialog.setPositiveButton(getResources().getString(R.string.yes), 
          new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
              // Exit our window activity
              MainActivity.this.finish();
            }
          }
        );

        alertDialog.setNegativeButton(getResources().getString(R.string.no), 
          new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
              dialog.cancel();
            }
          }
        );

        // create the actual dialog
        AlertDialog dialog = alertDialog.create();

        // show the dialog
        dialog.show();
      }
    });
  }
}