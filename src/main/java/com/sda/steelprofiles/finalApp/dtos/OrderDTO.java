package com.sda.steelprofiles.finalApp.dtos;

import java.time.LocalDate;

public class OrderDTO {
    private Long id;
    private LocalDate dateCreated;
    private String status;

    public OrderDTO() {
    }

    public OrderDTO(Long id, LocalDate dateCreated, String status) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
