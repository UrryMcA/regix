package com.ulinc.regex.entity;

import java.lang.annotation.*;
import java.sql.Date;

public class TableRecord {

    private Date period;
    private Date create;
    private boolean activity;

    @Target(value=ElementType.FIELD)
    @Retention(value= RetentionPolicy.SOURCE)
    public @interface Dimention{};

    public Date getPeriod() {
        return period;
    }

    public void setPeriod(Date period) {
        this.period = period;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    public boolean isActivity() {
        return activity;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }


}
