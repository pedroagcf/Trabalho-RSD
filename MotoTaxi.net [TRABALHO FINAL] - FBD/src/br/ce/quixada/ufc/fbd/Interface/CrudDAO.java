package br.ce.quixada.ufc.fbd.Interface;


import java.util.List;

public interface CrudDAO<T> {

	public void add(T t);
	public List<T> list();
	public boolean delete(int id);
	public T find(int id);
	
}
