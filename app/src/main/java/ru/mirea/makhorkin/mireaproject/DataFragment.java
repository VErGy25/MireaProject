package ru.mirea.makhorkin.mireaproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import ru.mirea.makhorkin.mireaproject.databinding.FragmentDataBinding;

public class DataFragment extends Fragment {

    private FragmentDataBinding binding;

    @SuppressLint("SetTextI18n")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DataViewModel dataViewModel =
                new ViewModelProvider(this).get(DataViewModel.class);

        binding = FragmentDataBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textData;
        final TextView textView2 = binding.textData2;
        textView.setText("Барби 2023 г. \n Комедия/Фэнтези");

        textView2.setText("Ба́рби» — предстоящий американский фильм в жанре романтической комедии режиссёра Греты Гервиг." +
                " Сценарий к фильму, написанный Гретой Гервиг и Ноа Баумбахом, основан на серии игрушек Барби от компании Mattel." +
                " Актёрский ансамбль возглавляют Марго Робби и Райан Гослинг, исполняющие роли Барби и Кена соответственно.");



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}