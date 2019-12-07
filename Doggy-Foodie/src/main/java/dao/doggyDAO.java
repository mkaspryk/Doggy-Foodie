package dao;

import org.springframework.data.repository.CrudRepository;
import model.doggyModel;

public interface doggyDAO extends CrudRepository<doggyModel,Integer>{

}
