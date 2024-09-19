package com.example.inicial1.services;

import com.example.inicial1.entities.Autor;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutorServices implements BaseService<Autor> {
    @Autowired
    private AutorRepository autorRepository;

    @Override
    @Transactional
    public List<Autor> findAll() throws Exception {
        try {
            List<Autor> entities = autorRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Autor findById(Long Id) throws Exception {
        try {
            Optional<Autor> entityOpcional = autorRepository.findById(Id);
            return entityOpcional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Autor save(Autor entity) throws Exception {
        try {
            entity = autorRepository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Autor update(Long id, Autor entity) throws  Exception {
        try {
            Optional<Autor> entityOpcional = autorRepository.findById(id);
            Autor autor = entityOpcional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Autor delete (Long id) throws Exception {
        try {
            if(autorRepository.existsById(id)){
                autorRepository.deleteById(id);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
