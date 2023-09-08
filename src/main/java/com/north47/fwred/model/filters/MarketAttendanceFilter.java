package com.north47.fwred.model.filters;

import com.north47.fwred.model.Location;

public class MarketAttendanceFilter {

    private String addressText;

    private String city;

    private Location near;

    private Integer nearRangeKm = 1;

    private Boolean upcoming = true;

    private Integer page = 0;

    private Integer pageSize = 10;


}
