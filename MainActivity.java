package mm.com.fairway.mylesson14;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView myListView;
    ArrayList<RowItem> myRowItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRowItems = new ArrayList<RowItem>();
        myListView = (ListView) findViewById(R.id.flagListView);

        fillArrayList();
        CustomAdapter myAdapter = new CustomAdapter(getApplicationContext(), myRowItems);
        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                RowItem list_row = myRowItems.get(i);

                Intent bigFlagIntent = new Intent(getApplicationContext(),BigImage.class);
                bigFlagIntent.putExtra("IMAGE_NAME",list_row.getBigImageName());

                startActivity(bigFlagIntent);
            }
        });
    }

    private void fillArrayList() {

        RowItem row_one = new RowItem();
        row_one.setHeading("Flag of France");
        row_one.setSubHeading("France");
        row_one.setSmallImageName(R.drawable.small_france);
        row_one.setBigImageName(R.drawable.big_france);
        myRowItems.add(row_one);

        RowItem row_two = new RowItem();
        row_two.setHeading("Flag of Sweden");
        row_two.setSubHeading("Sweden");
        row_two.setSmallImageName(R.drawable.small_sweden);
        row_two.setBigImageName(R.drawable.big_sweden);
        myRowItems.add(row_two);

        RowItem row_three = new RowItem();
        row_three.setHeading("Flag of Germany");
        row_three.setSubHeading("Germany");
        row_three.setSmallImageName(R.drawable.small_germany);
        row_three.setBigImageName(R.drawable.big_germany);
        myRowItems.add(row_three);

        RowItem row_four = new RowItem();
        row_four.setHeading("Flag of Italy");
        row_four.setSubHeading("Italy");
        row_four.setSmallImageName(R.drawable.small_italy);
        row_four.setBigImageName(R.drawable.big_italy);
        myRowItems.add(row_four);

        RowItem row_five = new RowItem();
        row_five.setHeading("Flag of Romania");
        row_five.setSubHeading("Romania");
        row_five.setSmallImageName(R.drawable.small_romania);
        row_five.setBigImageName(R.drawable.big_romania);
        myRowItems.add(row_five);
    }
}
