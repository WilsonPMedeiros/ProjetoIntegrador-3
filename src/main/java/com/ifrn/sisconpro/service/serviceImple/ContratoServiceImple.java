package com.ifrn.sisconpro.service.serviceImple;

import com.ifrn.sisconpro.model.Contrato;
import com.ifrn.sisconpro.repository.ContratoRepository;
import com.ifrn.sisconpro.service.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class ContratoServiceImple implements ContratoService {

    @Autowired
    ContratoRepository repository;

    @Override
    public List<Contrato> findAll() {
        return repository.findAll();
    }

    @Override
    public Contrato findById(Long id) {
        // findById() retorna um Option, para obter o Produto é necessário
        // adicionar o .get()
        return repository.findById(id).get();
    }

    @Override
    public Contrato save(Contrato contrato) {
        return repository.save(contrato);
    }

    @Override
    public void deleteById(Long id) { repository.deleteById(id); }


}
