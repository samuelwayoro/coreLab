package coreLab.structure_de_donnees.genericite;

import java.util.List;

public interface IMetier<T,U> {
	
	public T save(T t);
	
	public T getById(U u);
	
	public T updateById(U u , T t);
	
	public List<T> getAll();
	
	public void deleteById(U u);
	

}
