package pl.edu.uj.fais.gsa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.uj.fais.gsa.repository.ShaderRepository;

@Service
public class ProjectService {

    @Autowired
    private ShaderRepository shaderRepository;
}
