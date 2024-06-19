package ma.ac.uit.ensa.ssi.Booku.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import ma.ac.uit.ensa.ssi.Booku.R;

public class BookHolder extends RecyclerView.ViewHolder {
    public ImageView cover;
    public TextView text;

    public BookHolder(View item) {
        super(item);
        cover = item.findViewById(R.id.book_cover);
        text  = item.findViewById(R.id.book_text);
    }
}
