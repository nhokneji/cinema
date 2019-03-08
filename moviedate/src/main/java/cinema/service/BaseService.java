package cinema.service;

import cinema.domain.Response.BaseResponse;

import java.util.List;

public interface BaseService<T> {
    public void save(T t);
    BaseResponse findAll();
    BaseResponse findById(Integer id);
}
