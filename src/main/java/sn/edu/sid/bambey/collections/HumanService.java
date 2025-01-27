package sn.edu.sid.bambey.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import sn.edu.sid.bambey.Human;
/**
 * An implementation of a human 
 */
public class HumanService implements Crud<Human> {
	private List<Human> sapiens = new ArrayList<>();

	@Override
	public Human add(Human t) {
		sapiens.add(t);
		return sapiens.getLast();

	}

	@Override
	public List<Human> getAll() {
		return sapiens;
	}

	@Override
	public List<Human> findBy(String key) {
		return sapiens.stream()
                .filter(h -> h.lastName().equalsIgnoreCase(key))
                .collect(Collectors.toList());
	}

	@Override
	public void update(Integer id, Human t) {
		sapiens = sapiens.stream()
	                .map(h -> h.idCard().equals(id) ? t : h)
	                .collect(Collectors.toList());

	}

	@Override
	public void delete(Integer id) {
		sapiens = sapiens.stream()
	                .filter(h -> !h.idCard().equals(id))
	                .collect(Collectors.toList());

	}
}
