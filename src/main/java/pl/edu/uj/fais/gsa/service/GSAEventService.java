package pl.edu.uj.fais.gsa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.uj.fais.gsa.repository.GSAEventRepository;

@Service
public class GSAEventService {

    @Autowired
    private GSAEventRepository gsaEventRepository;

}
