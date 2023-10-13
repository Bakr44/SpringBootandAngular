package com.example.demo.Model;

import com.example.demo.Enumeration.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Server {

    @Id
    @GeneratedValue(strategy= AUTO)
    private Long id;
    @Column(unique = true)
    @NotEmpty(message = "IP Address cannot be empty or null ")
    private String idAddress;
    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    @Getter
    private Status status;


    public void getStatus(Status status) {
    }
}