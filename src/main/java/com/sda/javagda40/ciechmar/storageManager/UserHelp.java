package com.sda.javagda40.ciechmar.storageManager;

import com.google.protobuf.MapEntry;

import java.util.HashMap;
import java.util.Map;

public class UserHelp {

    static void list() {
        Map<String, String> helpList = new HashMap<>();
        helpList.put("user find       ", "Find user by Id, Surname, telephone Number");
        helpList.put("user add        ", "Add user or company");
        helpList.put("user delete     ", "Delete user");
        helpList.put("user list       ", "Show all user list (id, name, tel number, email, password) ");
        helpList.put("storage find    ", "Find storage by Id, size, door number, status ");
        helpList.put("storage add     ", "Add new storage");
        helpList.put("storage delete  ", "Delete storage");
        helpList.put("storage list    ", "Show all storage list (id, size, floor, color, status, for sanepid use, is it garage");
        helpList.put("storage rent    ", "Rent new storage");
        helpList.put("end             ", "Close program");
        helpList.put("show free       ", "Show list of free storages sort by size");
        helpList.put("show reservation", "Show list of rent storages sort by size");
        System.out.println("Lista komend:");
        for (Map.Entry<String, String> all : helpList.entrySet()) {
            System.out.println(all.getKey() + ": "+ all.getValue());
        }
    }
}
