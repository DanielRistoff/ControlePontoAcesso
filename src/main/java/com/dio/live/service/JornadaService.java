package com.dio.live.service;

import com.dio.live.repository.JornadaRepository;
import com.dio.live.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    @Autowired
    JornadaRepository jornadaRepository;

    public JornadaTrabalho saveJoranadaTrabalho(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll(){
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public JornadaTrabalho updateJoranadaTrabalho(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public void deleteJornada(Long idJornada) {
       jornadaRepository.deleteById(idJornada);
    }
}
