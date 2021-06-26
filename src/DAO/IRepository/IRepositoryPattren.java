package DAO.IRepository;

import java.sql.SQLException;
import java.util.List;

public interface IRepositoryPattren<T> {
    public List<T> getAll();
    public List<T> getAllByPatient(int id);
    public T getById(int id);
    public void create(T element);
    public void delete(int id);
    public void update(T element);
}
