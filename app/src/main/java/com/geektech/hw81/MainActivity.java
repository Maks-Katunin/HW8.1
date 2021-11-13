package com.geektech.hw81;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.geektech.hw81.adapter.MessageAdapter;
import com.geektech.hw81.databinding.ActivityMainBinding;
import com.geektech.hw81.model.Message;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ArrayList<Message> messageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setMessages();
        initRecyclerView();
    }

    private void setMessages() {
        messageList = new ArrayList<>();
        messageList.add(new Message("Hello", 0));
        messageList.add(new Message("Hello", 1));
        messageList.add(new Message("How are you", 0));
        messageList.add(new Message("I'm fine, and you", 1));
        messageList.add(new Message("I'm ok. Where are you from?", 0));
        messageList.add(new Message("I'm from Kyrgyzstan, and you are from?", 1));
        messageList.add(new Message("I'm from Australia. What your name? ", 0));
        messageList.add(new Message("My name is John. And what your name?", 1));
        messageList.add(new Message("I'm Jack.", 0));
        messageList.add(new Message("Hello", 0));
        messageList.add(new Message("Hello", 1));
        messageList.add(new Message("How are you", 0));
        messageList.add(new Message("I'm fine, and you", 1));
        messageList.add(new Message("I'm ok. Where are you from?", 0));
        messageList.add(new Message("I'm from Kyrgyzstan, and you are from?", 1));
        messageList.add(new Message("I'm from Australia. What your name? ", 0));
        messageList.add(new Message("My name is John. And what your name?", 1));
        messageList.add(new Message("I'm Jack.", 0));
        messageList.add(new Message("Hello", 0));
        messageList.add(new Message("Hello", 1));
        messageList.add(new Message("How are you", 0));
        messageList.add(new Message("I'm fine, and you", 1));
        messageList.add(new Message("I'm ok. Where are you from?", 0));
        messageList.add(new Message("I'm from Kyrgyzstan, and you are from?", 1));
        messageList.add(new Message("I'm from Australia. What your name? ", 0));
        messageList.add(new Message("My name is John. And what your name?", 1));
        messageList.add(new Message("I'm Jack.", 0));
        messageList.add(new Message("Hello", 0));
        messageList.add(new Message("Hello", 1));
        messageList.add(new Message("How are you", 0));
        messageList.add(new Message("I'm fine, and you", 1));
        messageList.add(new Message("I'm ok. Where are you from?", 0));
        messageList.add(new Message("I'm from Kyrgyzstan, and you are from?", 1));
        messageList.add(new Message("I'm from Australia. What your name? ", 0));
        messageList.add(new Message("My name is John. And what your name?", 1));
        messageList.add(new Message("I'm Jack.", 0));
    }
    

    private void initRecyclerView() {
        MessageAdapter adapter = new MessageAdapter(messageList);
        binding.recycler.setAdapter(adapter);
    }

}