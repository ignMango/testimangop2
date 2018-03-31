package ar.com.imango.examenp2.model;

import java.util.List;

public class PagedResult<T> {
    private List<T> items;
    private PaginationDTO pagination;


    public PagedResult(List<T> items, long totalElements, int offset, int limit) {
        this.items = items;
        this.pagination = new PaginationDTO(offset, limit, totalElements);
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public PaginationDTO getPagination() {
        return pagination;
    }

    public void setPagination(PaginationDTO pagination) {
        this.pagination = pagination;
    }
}
