package com.enricoruggieri.to_gsheet;

import com.enricoruggieri.json_to_gspreadsheet.TableCast;
import com.enricoruggieri.to_gsheet.TableMaps.TableMapCast;
import com.enricoruggieri.to_gsheet.TableMaps.TableMapLocation;
import com.enricoruggieri.to_gsheet.TableMaps.TableMapRepertoireAndDivisi;
import com.enricoruggieri.to_gsheet.TableMaps.TableMapSchedule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ValueListsBuilder {

    public static List<List<Object>> buildScheduleValueList(String projectId, List<TableMapSchedule> table) {
        List<List<Object>> valueList = new ArrayList<>();
        valueList.add(Arrays.asList(columnTitleSchedule()));

        for (TableMapSchedule record : table) {
            if (record.getMusicProject().contains(projectId)) {
                List<Object> recordList = new ArrayList<>();
                recordList.add(record.getDoDateStart()
                        .substring(0, 10));
                if (record.getDoDateStart().length() > 10) {
                    recordList.add(record.getDoDateStart()
                            .substring(11, 16));
                } else {
                    recordList.add("");
                }
                if (record.getDoDateEnd() == null || record.getDoDateEnd().length() < 10) {
                    recordList.add("");
                } else {
                    recordList.add(record.getDoDateEnd()
                            .substring(11, 16));
                }
                recordList.add(record.getType());
                recordList.add(record.getTask());
                recordList.add(record.getDuration());
                if (record.getLocationRollup().toString().length() < 1) {
                    recordList.add("");
                } else {
                    recordList.add(record.getLocationRollup()
                            .toString()
                            .substring(1, record.getLocationRollup().toString().length() - 1));
                }
                valueList.add(recordList);
            }
        }
        return valueList;
    }

    private static String[] columnTitleSchedule() {
        return new String[]{
                Config.SCHEDULE_VALUE_LIST_COLUMN_0,
                Config.SCHEDULE_VALUE_LIST_COLUMN_1,
                Config.SCHEDULE_VALUE_LIST_COLUMN_2,
                Config.SCHEDULE_VALUE_LIST_COLUMN_3,
                Config.SCHEDULE_VALUE_LIST_COLUMN_4,
                Config.SCHEDULE_VALUE_LIST_COLUMN_5,
                Config.SCHEDULE_VALUE_LIST_COLUMN_6
        };
    }

    public static List<List<Object>> buildCastValueList(String projectId, List<TableMapCast> table) {
        List<List<Object>> valueList = new ArrayList<>();
        valueList.add(Arrays.asList(columnTitleCast()));

        for (TableMapCast record : table) {
            if (record.getMusicProject().contains(projectId) &&
            record.getStatus().equals("Confirmed")) {
                List<Object> recordList = new ArrayList<>();
                recordList.add(record.getRole());
                recordList.add(record.getSingerRollup());
                recordList.add(record.getEmail());
                recordList.add(record.getNote());
                valueList.add(recordList);
            }
        }
        return valueList;
    }

    private static String[] columnTitleCast() {
        return new String[]{
                Config.CAST_VALUE_LIST_COLUMN_0,
                Config.CAST_VALUE_LIST_COLUMN_1,
                Config.CAST_VALUE_LIST_COLUMN_2,
                Config.CAST_VALUE_LIST_COLUMN_3
        };
    }

    public static List<List<Object>> buildRepertoireValueList(String projectId, List<TableMapRepertoireAndDivisi> table) {
        List<List<Object>> valueList = new ArrayList<>();
        valueList.add(Arrays.asList(columnTitleRepertoire()));

        for (TableMapRepertoireAndDivisi record : table) {
            if (record.getMusicProject().contains(projectId) &&
                    record.getSelected()) {
                List<Object> recordList = new ArrayList<>();
                recordList.add(record.getOrder());
                recordList.add(record.getMusicRollup());
                recordList.add(record.getComposerRollup());
                recordList.add(record.getVoicesRollup());
                recordList.add(record.getSoloRollup());
                recordList.add(record.getInstrumentRollup());
                recordList.add(record.getScoreRollup());
                recordList.add(record.getMediaRollup());
                recordList.add(record.getRecordingRollup());
                recordList.add(record.getNote());
                valueList.add(recordList);
            }
        }
        return valueList;
    }

    private static String[] columnTitleRepertoire() {
        return new String[]{
                Config.REPERTOIRE_VALUE_LIST_COLUMN_0,
                Config.REPERTOIRE_VALUE_LIST_COLUMN_1,
                Config.REPERTOIRE_VALUE_LIST_COLUMN_2,
                Config.REPERTOIRE_VALUE_LIST_COLUMN_3,
                Config.REPERTOIRE_VALUE_LIST_COLUMN_4,
                Config.REPERTOIRE_VALUE_LIST_COLUMN_5,
                Config.REPERTOIRE_VALUE_LIST_COLUMN_6,
                Config.REPERTOIRE_VALUE_LIST_COLUMN_7,
                Config.REPERTOIRE_VALUE_LIST_COLUMN_8,
                Config.REPERTOIRE_VALUE_LIST_COLUMN_9
        };
    }

    public static List<List<Object>> buildDivisiValueList(String projectId, List<TableMapRepertoireAndDivisi> table) {
        List<List<Object>> valueList = new ArrayList<>();
        valueList.add(Arrays.asList(columnTitleDivisi()));

        for (TableMapRepertoireAndDivisi record : table) {
            if (record.getMusicProject().contains(projectId) &&
                    record.getSelected()) {
                List<Object> recordList = new ArrayList<>();
                recordList.add(record.getOrder());
                recordList.add(record.getMusicRollup());
                recordList.add(record.getDivisi1());
                recordList.add(record.getDivisi2());
                recordList.add(record.getDivisi3());
                recordList.add(record.getDivisi4());
                recordList.add(record.getDivisi5());
                recordList.add(record.getDivisi6());
                recordList.add(record.getDivisi7());
                recordList.add(record.getDivisi8());
                recordList.add(record.getDivisi9());
                recordList.add(record.getDivisi10());
                recordList.add(record.getDivisi11());
                recordList.add(record.getDivisi12());
                valueList.add(recordList);
            }
        }
        return valueList;
    }

    private static String[] columnTitleDivisi() {
        return new String[]{
                Config.DIVISI_VALUE_LIST_COLUMN_0,
                Config.DIVISI_VALUE_LIST_COLUMN_1,
                Config.DIVISI_VALUE_LIST_COLUMN_2,
                Config.DIVISI_VALUE_LIST_COLUMN_3,
                Config.DIVISI_VALUE_LIST_COLUMN_4,
                Config.DIVISI_VALUE_LIST_COLUMN_5,
                Config.DIVISI_VALUE_LIST_COLUMN_6,
                Config.DIVISI_VALUE_LIST_COLUMN_7,
                Config.DIVISI_VALUE_LIST_COLUMN_8,
                Config.DIVISI_VALUE_LIST_COLUMN_9,
                Config.DIVISI_VALUE_LIST_COLUMN_10,
                Config.DIVISI_VALUE_LIST_COLUMN_11,
                Config.DIVISI_VALUE_LIST_COLUMN_12,
                Config.DIVISI_VALUE_LIST_COLUMN_13,
                Config.DIVISI_VALUE_LIST_COLUMN_14,
        };
    }

    public static List<List<Object>> buildLocationValueList(String projectId, List<TableMapLocation> tableLocation, List<TableMapSchedule> tableSchedule) {
        List<List<Object>> valueList = new ArrayList<>();
        valueList.add(Arrays.asList(columnTitleLocation()));

        List<String> locations = new ArrayList<>();
        for (TableMapSchedule record : tableSchedule) {
            if (record.getMusicProject().contains(projectId)) {
                locations.add(record.getLocationRollup().toString());
            }
        }
       for (TableMapLocation record : tableLocation) {
           if (locations.toString().contains(record.getLocation()) &&
           !record.getLocation().equals("")) {
               List<Object> recordList = new ArrayList<>();
               recordList.add(record.getLocation());
               recordList.add(record.getAddress());
               recordList.add(record.getCity());
               valueList.add(recordList);
           }
       }
        return valueList;
    }

    private static String[] columnTitleLocation() {
        return new String[]{
                Config.LOCATION_VALUE_LIST_COLUMN_0,
                Config.LOCATION_VALUE_LIST_COLUMN_1,
                Config.LOCATION_VALUE_LIST_COLUMN_2,
        };
    }
}
