package com.nitrr.cse.incredible.eduone.Subject;
        import android.content.Context;
        import android.media.Image;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ProgressBar;
        import android.widget.TextView;

        import com.android.volley.toolbox.ImageLoader;
        import com.android.volley.toolbox.NetworkImageView;
        import com.nitrr.cse.incredible.eduone.R;

        import org.w3c.dom.Text;

        import java.util.ArrayList;
        import java.util.List;


public class ScardAdapter extends RecyclerView.Adapter<ScardAdapter.ViewHolder> {

    //Imageloader to load image
    private ImageLoader imageLoader;
    private Context context;

    //List to store all superheroes
    List<SContent> sContents;

    //Constructor of this class
    public ScardAdapter(List<SContent> sContents, Context context){
        super();
        //Getting all superheroes
        this.sContents = sContents;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mysubject_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        //Getting the particular item from the list
        SContent sContent =  sContents.get(position);

        //Loading image from url
        imageLoader = SCustomVolleyRequest.getInstance(context).getImageLoader();
        imageLoader.get(sContent.getImageUrl(), ImageLoader.getImageListener(holder.imageView, R.drawable.image, android.R.drawable.ic_dialog_alert));

        //Showing data on the views
        holder.imageView.setImageUrl(sContent.getImageUrl(), imageLoader);
        holder.textViewId.setText(sContent.getId());
        holder.textViewName.setText(sContent.getName());
        holder.textViewPost.setText(sContent.getPost());

    }

    @Override
    public int getItemCount() {
        return sContents.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        //Views
        public NetworkImageView imageView;
        public TextView textViewId;
        public TextView textViewName;
        public TextView textViewPost;

        //Initializing Views
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (NetworkImageView) itemView.findViewById(R.id.imageViewSubjects);
            textViewId = (TextView) itemView.findViewById(R.id.textViewId);
            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewPost = (TextView) itemView.findViewById(R.id.textViewPost);

        }
    }
}