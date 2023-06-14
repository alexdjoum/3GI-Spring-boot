package com.example.demo.Service;

import lombok.AllArgsConstructor;
import com.example.demo.model.Cycle;
import org.springframework.stereotype.Service;
import com.example.demo.repository.CycleRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CycleServiceImpl implements  CycleService {

    private final CycleRepository cycleRepository;

    @Override
    public Cycle create(Cycle cycle) {
        return cycleRepository.save(cycle);
    }

    @Override
    public List<Cycle> read() {
        return cycleRepository.findAll();
    }

    @Override
    public Cycle update(Long id, Cycle cycle) {
        return cycleRepository.findById(id)
                .map(cyc->{
                    cyc.setDescription(cycle.getDescription());
                    cyc.setNom(cycle.getNom());

                    return cycleRepository.save(cycle);

                }).orElseThrow(()->new RuntimeException("Cycle Inconnu ! "));
    }

    @Override
    public String delete(Long id) {

        cycleRepository.deleteById(id);
        return "Cycle supprimé";
    }
}
