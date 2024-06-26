package com.api.employerManagement.service;

import com.api.employerManagement.entity.Employer;
import com.api.employerManagement.repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Objects;

@Service
public class EmployerService {
    private final EmployerRepository employerRepository;

    @Autowired
    public EmployerService(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    /**
     * delete element
     *
     * @param id element ID
     * @throws EntityNotFoundException Exception when retrieve entity
     */
    public void delete(Integer id) {
        Employer entity = employerRepository.findById(id)
                                            .orElseThrow(() -> new EntityNotFoundException(String.format("Can not find the entity employer (%s = %s).", "id", id.toString())));
        employerRepository.delete(entity);
    }

    /**
     * @param id element ID
     * @return element
     * @throws EntityNotFoundException Exception when retrieve element
     */
    public Employer get(Integer id) {
        return employerRepository.findById(id)
                                 .orElseThrow(() -> new EntityNotFoundException(String.format("Can not find the entity employer (%s = %s).", "id", id.toString())));
    }


    /**
     * get all elements.
     *
     * @return elements
     */
    public List<Employer> get() {
        return (List<Employer>) employerRepository.findAll();
    }

    /**
     * create element.
     *
     * @param item element to create
     * @return element after creation
     * @throws EntityNotFoundException Exception when retrieve entity
     */
    public Employer create(Employer item) {
        return save(item);
    }

    /**
     * update element
     *
     * @param id   element identifier
     * @param item element to update
     * @return element after update
     * @throws EntityNotFoundException Exception when retrieve entity
     */
    public Employer update(Integer id, Employer item) {
        Objects.requireNonNull(item, "Can not update entity, entity is null.");
        if (!id.equals(item.getId())) {
            throw new IllegalArgumentException(String.format("Can not update entity, the resource ID (%d) not match the objet ID (%d).", id, item.getId()));
        }
        return save(item);
    }

    /**
     * create \ update elements
     *
     * @param item element to save
     * @return element after save
     */
    protected Employer save(Employer item) {
        return employerRepository.save(item);
    }
}
