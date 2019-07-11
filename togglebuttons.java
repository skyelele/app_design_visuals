package com.gohool.toogle.togglebutton;

public class MainActivity extends AppCompatActivity {
  private ToggleButton toggleButton;
  private TextView resultView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    resultView = (TextView) findViewById(R.id.peekAbooTextView);

    toggleButton = (ToggleButton) findViewById(R.id.toggleButtonID);
    toggleButton.setOnCheckedChangeListener( new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void OnCheckedChangeListener(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
          resultView.setVisibility(View.VISIBLE);
        } else {
          resultView.setVisibility(View.INVISIBLE);
        }
      }
    })
  }
}