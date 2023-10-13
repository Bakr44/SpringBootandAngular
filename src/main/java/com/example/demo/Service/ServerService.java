package com.example.demo.Service;

import com.example.demo.Model.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

public interface ServerService {

    Server create(Server server);
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int Limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
