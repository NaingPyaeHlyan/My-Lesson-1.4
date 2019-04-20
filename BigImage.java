package mm.com.fairway.mylesson14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class BigImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_image);

        Intent flagIntent = getIntent();
        int big_flag_int = flagIntent.getIntExtra("IMAGE_NAME",0);

        ImageView imageView = (ImageView)findViewById(R.id.bigFlagImage);

        imageView.setImageResource(big_flag_int);
    }
}
