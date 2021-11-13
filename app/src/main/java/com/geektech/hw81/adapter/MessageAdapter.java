package com.geektech.hw81.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.hw81.databinding.ItemReceivedBinding;
import com.geektech.hw81.databinding.ItemSenderBinding;
import com.geektech.hw81.model.Message;

import java.util.ArrayList;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder> {
    private static int TYPE_SENDER = 0;
    private static int TYPE_RECEIVED = 1;

    private ArrayList<Message> list = new ArrayList<>();

    public MessageAdapter(ArrayList<Message> list) {
        this.list = list;
    }

    @Override
    public int getItemViewType(int position) {
        if (list.get(position).getType() == TYPE_SENDER) {
            return TYPE_SENDER;
        } else {
            return TYPE_RECEIVED;
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TYPE_SENDER) {
            ItemSenderBinding senderBinding = ItemSenderBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            return new ViewHolder(senderBinding);
        } else {
            ItemReceivedBinding receivedBinding = ItemReceivedBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            return new ViewHolder(receivedBinding);

        }
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ItemReceivedBinding receivedBinding;
        private ItemSenderBinding senderBinding;

        public ViewHolder(@NonNull ItemReceivedBinding binding) {
            super(binding.getRoot());
            receivedBinding = binding;
        }


        public ViewHolder(@NonNull ItemSenderBinding binding) {
            super(binding.getRoot());
            senderBinding = binding;
        }

        public void bind(Message message) {
            if (message.getType() == TYPE_RECEIVED) {
                receivedBinding.message.setText(message.getMessage());
            } else {
                senderBinding.message.setText(message.getMessage());
            }
        }
    }
}
