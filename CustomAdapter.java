package mm.com.fairway.mylesson14;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private ArrayList<RowItem> singleRow;
    private LayoutInflater thisInflater;

    public CustomAdapter(Context context, ArrayList<RowItem>aRow){
        this.singleRow = aRow;
        thisInflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return singleRow.size();
    }

    @Override
    public Object getItem(int i) {
        return singleRow.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = thisInflater.inflate(R.layout.list_view_row, viewGroup, false);
            TextView theHeading = (TextView)view.findViewById(R.id.txtHeading);
            TextView theSubHeading = (TextView)view.findViewById(R.id.txtSubHeading);
            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);

            RowItem currentRow = (RowItem)getItem(i);

            theHeading.setText(currentRow.getHeading());
            theSubHeading.setText(currentRow.getSubHeading());
            imageView.setImageResource(currentRow.getSmallImageName());
        }
        return view;
    }
}
