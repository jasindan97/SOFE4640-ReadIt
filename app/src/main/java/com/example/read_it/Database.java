package com.example.read_it;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "readit.db";

    public static final String TBL_AUTHORS = "author_table";
    public static final String AUTHOR_ID = "author_id";
    public static final String AUTHOR_NAME = "author_name";

    public static final String TBL_GENRES = "genre_table";
    public static final String GENRE_ID = "genre_id";
    public static final String GENRE_NAME = "genre_name";

    public static final String TBL_BOOKS = "book_table";
    public static final String BOOK_ID = "book_id";
    public static final String BOOK_NAME = "book_name";
    public static final String BOOK_GENRE_ID = "genre_id";
    public static final String BOOK_DESCRIPTION = "book_description";
    public static final String BOOK_AUTHOR_ID = "author_id";

    public static final String TBL_USERBOOKS = "userbooks_table";
    public static final String ENTRY_ID = "entry_id";
    public static final String USERBOOKS_BOOK_ID = "book_id";
    public static final String PROGRESS = "progress";
    public static final String IS_COMPLETE = "is_complete";

    public static final String TBL_NOTES = "note_table";
    public static final String NOTE_ID = "note_id";
    public static final String NOTE_ENTRY_ID = "entry_id";
    public static final String NOTE = "note";

    public static final String TBL_AUTHOR_PREFERENCES = "author_preferences_table";
    public static final String PREF_ID = "pref_id";
    public static final String AUTHOR_PREFERENCE_AUTHOR_ID = "author_id";

    public static final String TBL_GENRE_PREFERENCES = "genre_preferences_table";
    public static final String GENRE_PREF_PREF_ID = "pref_id";
    public static final String GENRE_PREF_GENRE_ID = "genre_id";

    private String TBL_CREATE_AUTHORS = "create table " + TBL_AUTHORS + " (" +
            AUTHOR_ID + " integer  primary key," +
            AUTHOR_NAME + " text)";

    private String TBL_CREATE_GENRES = "create table " + TBL_GENRES + " (" +
            GENRE_ID + " integer  primary key," +
            GENRE_NAME + " text)";

    private String TBL_CREATE_BOOKS = "create table " + TBL_BOOKS + " (" +
            BOOK_ID + " integer  primary key," +
            BOOK_NAME + " text," +
            BOOK_GENRE_ID + " integer," +
            BOOK_DESCRIPTION + " text," +
            BOOK_AUTHOR_ID + " integer)";

    private String TBL_CREATE_USERBOOKS = "create table " + TBL_USERBOOKS + " (" +
            ENTRY_ID + " integer  primary key," +
            USERBOOKS_BOOK_ID + " integer," +
            PROGRESS + " decimal," +
            IS_COMPLETE + " boolean)";

    private String TBL_CREATE_NOTES = "create table " + TBL_NOTES + " (" +
            NOTE_ID + " integer  primary key," +
            NOTE_ENTRY_ID + " integer," +
            NOTE + " text)";

    private String TBL_CREATE_AUTHOR_PREFERENCES = "create table " + TBL_AUTHOR_PREFERENCES + " (" +
            PREF_ID + " integer  primary key," +
            AUTHOR_PREFERENCE_AUTHOR_ID + " integer)";

    private String TBL_CREATE_GENRE_PREFERENCES = "create table " + TBL_GENRE_PREFERENCES + " (" +
            GENRE_PREF_PREF_ID + " integer  primary key," +
            GENRE_PREF_GENRE_ID + " integer)";

    public Database(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TBL_CREATE_AUTHORS);
        db.execSQL(TBL_CREATE_GENRES);
        db.execSQL(TBL_CREATE_BOOKS);
        db.execSQL(TBL_CREATE_USERBOOKS);
        db.execSQL(TBL_CREATE_NOTES);
        db.execSQL(TBL_CREATE_AUTHOR_PREFERENCES);
        db.execSQL(TBL_CREATE_GENRE_PREFERENCES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
