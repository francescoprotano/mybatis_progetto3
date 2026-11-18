package it.exolab.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import it.exolab.mapper.ClienteMapper;
import it.exolab.model.Cliente;
import it.exolab.util.MyBatisUtils;

public class ClienteDAO {
private static ClienteDAO instance;
	
	private ClienteDAO() {
		
	}
	public static ClienteDAO getInstance() {
		if(instance==null)
			instance = new ClienteDAO();
		return instance;
	}
	
	public void insert(Cliente model) {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		ClienteMapper theMapper = session.getMapper(ClienteMapper.class);
	    theMapper.insert(model);
	    session.commit();
	}
	
	public List<Cliente> findAll() {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		ClienteMapper theMapper = session.getMapper(ClienteMapper.class);
	    List<Cliente> ret = theMapper.findAll();
	    session.commit();
	    return ret;
	}
}
