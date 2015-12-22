package uih.chalermpol_k.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MyAdapter extends BaseAdapter{

    // Explicit
    private Context obContext;
    private String[] titleString, detailStrings;
    private int[] iconInts;

    public MyAdapter(Context obContext, String[] titleString, String[] detailStrings, int[] iconInts) {
        this.obContext = obContext;
        this.titleString = titleString;
        this.detailStrings = detailStrings;
        this.iconInts = iconInts;
    } // Constructor (Use Alt+Insert for top method)


    @Override
    public int getCount() {
        return titleString.length;// Auto count so that have a value
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Open service

        LayoutInflater objLayoutInflater = (LayoutInflater) obContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objview1 = objLayoutInflater.inflate(R.layout.my_listview, parent, false);

        //For title
        TextView titleTextview = (TextView) objview1.findViewById(R.id.textView2);
        titleTextview.setText(titleString[position]);

        // For Detail
        TextView detailTextView = (TextView) objview1.findViewById(R.id.textView3);
        detailTextView.setText(detailStrings[position]);

        // For Icon
        ImageView icImageView = (ImageView) objview1.findViewById(R.id.imageView);
        icImageView.setImageResource(iconInts[position]);

        return objview1;
    }
}   // Main Class
