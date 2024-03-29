package com.enricoruggieri.database_engine;

public class Config {

    // TODO Refactor names, add TABLE or replace DATABASE with TABLE

    // NOTION databases field names
    public static final String MUSIC_PROJECT_TABLE_ID = "a290b3f737f242b697959acb9f18283e";
    public static final String MUSIC_PROJECT_ID = "Id";
    public static final String MUSIC_PROJECT_TITLE = "Title";
    public static final String MUSIC_PROJECT_CHOIR = "Choir";
    public static final String MUSIC_PROJECT_CHOIR_ROLLUP = "Choir Rollup";
    public static final String MUSIC_PROJECT_TASK = "Task";
    public static final String MUSIC_PROJECT_CAST = "Cast";
    public static final String MUSIC_PROJECT_REPERTOIRE = "Repertoire";
    public static final String MUSIC_PROJECT_COMPLETED = "Completed";
    public static final String MUSIC_PROJECT_CANCELLED = "Cancelled";
    public static final String MUSIC_PROJECT_DESCRIPTION = "Description";
    public static final String MUSIC_PROJECT_TASKS_ROLLUP = "Task Rollup";

    public static final String REPERTOIRE_AND_DIVISI_TABLE_ID = "aaff3c7cc9fd4c49a9d0cead3d51f75b";
    public static final String REPERTOIRE_AND_DIVISI_ORDER = "Order";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_MUSIC = "Music";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_MUSIC_ROLLUP = "Music Rollup";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_COMPOSER_ROLLUP = "Composer Rollup";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_LENGTH_ROLLUP = "Length Rollup";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_VOICES_ROLLUP = "Voices Rollup";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_SOLO_ROLLUP = "Solo Rollup";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_INSTRUMENTS_ROLLUP = "Instruments Rollup";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_NOTE = "Note";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_SCORE_ROLLUP = "Score Rollup";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_MEDIA_ROLLUP = "Media Rollup";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_RECORDING_ROLLUP = "Recording Rollup";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_MUSIC_PROJECT = "Music Project";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_LENGTH = "Length";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_SELECTED = "Selected";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_1_TOP_VOICE = "1 - Top Voice";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_2 = "2";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_3 = "3";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_4 = "4";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_5 = "5";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_6 = "6";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_7 = "7";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_8 = "8";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_9 = "9";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_10 = "10";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_11 = "11";
    public static final String REPERTOIRE_AND_DIVISI_DATABASE_12 = "12";

    public static final String SCHEDULE_TABLE_ID = "b25b103631b34fc2a8804eec0b2b3813";
    public static final String SCHEDULE_TABLE_TASK = "Task";
    public static final String SCHEDULE_TABLE_TYPE = "Type";
    public static final String SCHEDULE_TABLE_DO_DATE = "Do Date";
    public static final String SCHEDULE_TABLE_MUSIC_PROJECT = "Music Project";
    public static final String SCHEDULE_TABLE_LOCATION_ROLLUP = "Location Rollup";
    public static final String SCHEDULE_TABLE_DURATION = "Duration";
//    public static final String SCHEDULE_TABLE_CHOIR_ROLLUP = "Choir Rollup";
    public static final String SCHEDULE_TABLE_LOCATION = "Location";

    public static final String CAST_DATABASE = "065066b1d60a478a9d8a2725b2fee660";
    public static final String CAST_TABLE_ROLE = "Role";
    public static final String CAST_TABLE_SINGER = "Singer";
    public static final String CAST_TABLE_SINGER_ROLLUP = "Singer Rollup";
    public static final String CAST_TABLE_EMAIL = "Email";
    public static final String CAST_TABLE_STATUS = "Status";
    public static final String CAST_TABLE_NOTE = "Note";
    public static final String CAST_TABLE_MUSIC_PROJECT = "Music Project";
    public static final String CAST_TABLE_PHONE = "Phone";

    public static final String LOCATION_TABLE_ID = "264aecbf12ec4d439a306d3360a70001";
    public static final String LOCATION_TABLE_LOCATION = "Location";
    public static final String LOCATION_TABLE_CITY = "City";
    public static final String LOCATION_TABLE_ADDRESS = "Address";
    public static final String LOCATION_TABLE_PURPOSE = "Purpose";
    public static final String LOCATION_TABLE_CONTACT = "Contact";
    public static final String LOCATION_TABLE_EMAIL = "Email";

    // GoogleSheet field names
    public static final String REPERTOIRE_VALUE_LIST_COLUMN_0 = "Order";
    public static final String REPERTOIRE_VALUE_LIST_COLUMN_1 = "Title";
    public static final String REPERTOIRE_VALUE_LIST_COLUMN_2 = "Composer";
    public static final String REPERTOIRE_VALUE_LIST_COLUMN_3 = "Voicing";
    public static final String REPERTOIRE_VALUE_LIST_COLUMN_4 = "Solo";
    public static final String REPERTOIRE_VALUE_LIST_COLUMN_5 = "Instruments";
    public static final String REPERTOIRE_VALUE_LIST_COLUMN_6 = "Score";
    public static final String REPERTOIRE_VALUE_LIST_COLUMN_7 = "Midi";
    public static final String REPERTOIRE_VALUE_LIST_COLUMN_8 = "Recording";
    public static final String REPERTOIRE_VALUE_LIST_COLUMN_9 = "Note";

    public static final String SCHEDULE_VALUE_LIST_COLUMN_0 = "Date";
    public static final String SCHEDULE_VALUE_LIST_COLUMN_1 = "Start Time";
    public static final String SCHEDULE_VALUE_LIST_COLUMN_2 = "End Time";
    public static final String SCHEDULE_VALUE_LIST_COLUMN_3 = "Type";
    public static final String SCHEDULE_VALUE_LIST_COLUMN_4 = "Program";
    public static final String SCHEDULE_VALUE_LIST_COLUMN_5 = "Duration";
    public static final String SCHEDULE_VALUE_LIST_COLUMN_6 = "Location";

    public static final String DIVISI_VALUE_LIST_COLUMN_0 = "Order";
    public static final String DIVISI_VALUE_LIST_COLUMN_1 = "Title";
    public static final String DIVISI_VALUE_LIST_COLUMN_2 = "Composer";
    public static final String DIVISI_VALUE_LIST_COLUMN_3 = "1 - top voice";
    public static final String DIVISI_VALUE_LIST_COLUMN_4 = "2";
    public static final String DIVISI_VALUE_LIST_COLUMN_5 = "3";
    public static final String DIVISI_VALUE_LIST_COLUMN_6 = "4";
    public static final String DIVISI_VALUE_LIST_COLUMN_7 = "5";
    public static final String DIVISI_VALUE_LIST_COLUMN_8 = "6";
    public static final String DIVISI_VALUE_LIST_COLUMN_9 = "7";
    public static final String DIVISI_VALUE_LIST_COLUMN_10 = "8";
    public static final String DIVISI_VALUE_LIST_COLUMN_11 = "9";
    public static final String DIVISI_VALUE_LIST_COLUMN_12 = "10";
    public static final String DIVISI_VALUE_LIST_COLUMN_13 = "11";
    public static final String DIVISI_VALUE_LIST_COLUMN_14 = "12";

    public static final String CAST_VALUE_LIST_COLUMN_0 = "Role";
    public static final String CAST_VALUE_LIST_COLUMN_1 = "Singer";
    public static final String CAST_VALUE_LIST_COLUMN_2 = "Email";
    public static final String CAST_VALUE_LIST_COLUMN_3 = "Note";

    public static final String LOCATION_VALUE_LIST_COLUMN_0 = "Location";
    public static final String LOCATION_VALUE_LIST_COLUMN_1 = "Address";
    public static final String LOCATION_VALUE_LIST_COLUMN_2 = "City";

    // Google Drive config
    public static final String MAIN_FOLDER_ID = "1ggP6aU93RJT1HzgigtzIA6YLeMWAJtKD";
    public static final String TEST_FOLDER_ID = "1txa9YdUZAWS9__Y_gjpH3pSydeGmenI6";


}
