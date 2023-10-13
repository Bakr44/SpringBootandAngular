package com.example.demo.Repository;

import com.example.demo.Model.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collections;

@Repository
public interface ServerRepo extends JpaRepository<Server,Long> {
    Server findByIdAddress(String ipAddress);

}
