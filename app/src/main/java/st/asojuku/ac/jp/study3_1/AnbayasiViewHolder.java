package st.asojuku.ac.jp.study3_1;

/**
 * Created by Itchy on 2016/09/09.
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class AnbayasiViewHolder extends RecyclerView.ViewHolder{

    View base;
    TextView textViewNumber;
    TextView textViewComment;

    public AnbayasiViewHolder(View v){
        super(v);

        this.base=v;
        this.textViewNumber = (TextView) v.findViewById(R.id.number);
        this.textViewComment = (TextView) v.findViewById(R.id.comment);
    }
}
