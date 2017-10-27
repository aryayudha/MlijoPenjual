package com.example.aryaym.mlijopenjual.Obrolan;

import com.example.aryaym.mlijopenjual.Utils.Constants;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AryaYM on 24/10/2017.
 */

public class ObrolanTerakhir {
    private String penerimaId;
    private long timestamp;

    public ObrolanTerakhir(String penerimaId, long timestamp){
        this.penerimaId = penerimaId;
        this.timestamp = timestamp;
    }

    public String getPenerimaId() {
        return penerimaId;
    }

    public void setPenerimaId(String penerimaId) {
        this.penerimaId = penerimaId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Map<String, Object> toMap(){
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put(Constants.ID_PENERIMA, penerimaId);
        dataMap.put(Constants.TIMESTAMP, timestamp);
        return dataMap;
    }
}
