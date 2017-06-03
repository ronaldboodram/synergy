package com.synergy.motivate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.SimpleDateFormat;


@Entity
public class DailyMotivationMsg {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String msg;
    private String tag;




    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }


}
