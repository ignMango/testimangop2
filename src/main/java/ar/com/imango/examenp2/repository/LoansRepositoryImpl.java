package ar.com.imango.examenp2.repository;

import ar.com.imango.examenp2.model.Loans;
import ar.com.imango.examenp2.model.PagedResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Service
public class LoansRepositoryImpl implements LoansRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public PagedResult findById(int id, int offset, int limit) {
        String select = "SELECT l.* FROM loans l WHERE l.user_id = :id ";
        Query query = entityManager.createNativeQuery(select, Loans.class);
        query.setParameter("id", id);

        return this.executeSelect(query, offset, limit);
    }

    @Override
    public PagedResult findAll(Integer offset, Integer limit) {
        String select = "SELECT l.* FROM loans l";
        Query query = entityManager.createNativeQuery(select, Loans.class);
        return  this.executeSelect(query, offset, limit);
    }

    private PagedResult executeSelect(Query query, Integer offset, Integer limit) {
        query.setFirstResult(offset);
        query.setMaxResults(limit);

        final List<Loans> result = query.getResultList();
        List<Loans> resultList = new ArrayList<>();
        for (Loans obj: result ) {
            resultList.add(obj);
        }

        return new PagedResult(resultList, resultList.size() ,offset, limit);


    }

}
