package com.mdpa.guillermoantich.tinder.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mdpa.guillermoantich.tinder.R;
import com.mdpa.guillermoantich.tinder.model.Match;
import com.mdpa.guillermoantich.tinder.view.EditProfileActivity;
import com.mdpa.guillermoantich.tinder.view.MessageActivity;

import java.util.List;

/**
 * Created by Guillermo on 20/03/2018.
 */

public class MatchListAdapter extends RecyclerView.Adapter<MatchListAdapter.ViewHolder> {

    public MatchListAdapter(Context context, List<Match> values) {
        this.context = context;
        this.values = values;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //AÑADIR MÁS VALORES

        public TextView messagingSender;
        public ImageView messagingImage;
        public TextView lastMessage;
        public TextView lastMessageDate;
        public LinearLayout matchItem;

        public ViewHolder(View itemView)
        {
            super(itemView);

            //AÑADIR MÁS VALORES

            messagingSender = (TextView) itemView.findViewById(R.id.messaging_sender);
            messagingImage = (ImageView) itemView.findViewById(R.id.messaging_image);
            lastMessage = (TextView) itemView.findViewById(R.id.last_message);
            lastMessageDate = (TextView) itemView.findViewById(R.id.last_message_date);
            matchItem = (LinearLayout) itemView.findViewById(R.id.match_item);

        }
    }

    private final Context context;
    private List<Match> values;
    private Integer lastPosition = -1;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View inflatedView = inflater.inflate(R.layout.match_layout, parent, false);

        ViewHolder viewHolder = new ViewHolder(inflatedView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Match match = values.get(position);

        //AÑADIR MÁS VALORES

        holder.messagingSender.setText(match.getSender());
        holder.lastMessage.setText(match.getLast_message());
        holder.lastMessageDate.setText(match.getLast_message_date());

        holder.matchItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MessageActivity.class);
                intent.putExtra(MessageActivity.EXTRA_MATCH_ID, values.get(position).getSender());
                context.startActivity(intent);
            }
        });

        lastPosition = position;
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public void setValues(List<Match> values) {
        this.values = values;
    }

    @Override
    public void onViewDetachedFromWindow(ViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
    }
}
