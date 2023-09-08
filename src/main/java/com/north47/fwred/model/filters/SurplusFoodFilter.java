package com.north47.fwred.model.filters;

import com.north47.fwred.model.Location;

public class SurplusFoodFilter {

    private String text;

    private String producerEmail;

    private Location near;

    private Integer nearRangeKm = 1;

    private Boolean goodNow = true;

    private Integer goodInDays;

    private Integer page = 0;

    private Integer pageSize = 10;


}
