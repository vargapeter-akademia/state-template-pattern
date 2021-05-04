package hu.javamiddle.template2;

import lombok.Getter;

import java.util.List;

public abstract class Loader {

    @Getter
    private List<Object> records;

    // Template method
    public void load() {
        records = loadRecords();

        System.out.println(" --- LOADER: " + getRecordName() + " ---");
        System.out.println("Records loaded: " + records.size());
    }

    protected abstract List<Object> loadRecords();
    protected abstract String getRecordName();



}
