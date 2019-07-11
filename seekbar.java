package com.gohool.seekbar.seekbar;

public class MainActivity extends AppCompatActivitiy {
  private Seekbar seekbar;
  private TextView resultTextView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    resultTextView = (TextView) findViewById(R.id.resultID);
    seekBar = (SeekBar) findViewById(R.id.seekBarID);


    resultTextView.setText("Pain Level: " + seekBar.getProgress() + "/" + seekBar.getMax());
    resultTextView.setText();
    seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
      @Override
      public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        resultTextView.setTextColor(Color.GRAY);
        resultTextView.setText("Pain Level: " + seekBar.getProgress() + "/" + seekBar.getMax());
      }

      @Override
      public void onStartTrackingTouch(SeekBar seekBar) {

      }

      @Override
      public void onStopTrackingTouch(SeekBar seekB ar) {
        if (seekBar.getProgress() >= 7) {
          resultTextView.setTextColor(Color.RED);
        }
      }
    });
  }
}