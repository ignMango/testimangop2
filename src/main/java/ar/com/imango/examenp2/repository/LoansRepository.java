package ar.com.imango.examenp2.repository;

import ar.com.imango.examenp2.model.PagedResult;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface LoansRepository {

    PagedResult findById(int id, int offset, int limit);

    PagedResult findAll(Integer offset, Integer limit);
}
