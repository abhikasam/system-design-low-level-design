package com.systemdesign.parkinglot.models;

import lombok.Data;

@Data
public class Bill {
    private int id;
    private Ticket ticket;
    private long duration;
}
