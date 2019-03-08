package cinema.domain.repo.custom;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class BaseCustomRepo {
    @Autowired
    protected EntityManager entityManager;
}