package com.gmail.hanivisushiva.aksharafinserve.Adapters.Customer;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.gmail.hanivisushiva.aksharafinserve.Models.YourDoc.Datum;
import com.gmail.hanivisushiva.aksharafinserve.R;

import java.util.List;

public class YouDocAdapter extends RecyclerView.Adapter<YouDocAdapter.YourDocViewHolder> {

    private Context context;
    private List<Datum> yourDocList;
    DownloadManager downloadManager;

    public YouDocAdapter(Context context, List<Datum> yourDocList) {
        this.context = context;
        this.yourDocList = yourDocList;
    }

    @NonNull
    @Override
    public YourDocViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.customer_your_doc_item, null);
        return new YourDocViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull YourDocViewHolder yourDocViewHolder, int i) {

        Log.e("size",yourDocList.size()+"");
         yourDocViewHolder.des.setText(yourDocList.get(i).getDocumentspath());
         yourDocViewHolder.date.setText(yourDocList.get(i).getDate());
        final String url = yourDocList.get(i).getDocumentspath();


         yourDocViewHolder.download.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {


                 DownloadManager downloadManager = (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
                 Uri uri = Uri.parse(url);
                 DownloadManager.Request request = new DownloadManager.Request(uri);
                 request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                 Long ref = downloadManager.enqueue(request);
                 Toast.makeText(context.getApplicationContext(),
                         "Your file is now downloading...", Toast.LENGTH_LONG).show();
//                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
//                browserIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                context.startActivity(browserIntent);
             }
         });
    }

    @Override
    public int getItemCount() {
        return yourDocList.size();
    }

    public class YourDocViewHolder extends RecyclerView.ViewHolder{
        TextView des,date;
        ImageView download;
        public YourDocViewHolder(@NonNull View itemView) {
            super(itemView);

            des = itemView.findViewById(R.id.documents);
            date = itemView.findViewById(R.id.date);
            download = itemView.findViewById(R.id.download);
        }
    }
}
