package it.exolab.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import it.exolab.mapper.ProdottoMapper;
import it.exolab.model.Prodotto;
import it.exolab.util.MyBatisUtils;

public class ProdottoDAO {
	private static ProdottoDAO instance;
	
	private ProdottoDAO() {
		
	}
	public static ProdottoDAO getInstance() {
		if(instance==null)
			instance = new ProdottoDAO();
		return instance;
	}
	
	public void insert(Prodotto model) {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		ProdottoMapper theMapper = session.getMapper(ProdottoMapper.class);
	    theMapper.insert(model);
	    session.commit();
	}
	public void update(Prodotto model) {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		ProdottoMapper theMapper = session.getMapper(ProdottoMapper.class);
	    theMapper.update(model);
	    session.commit();
	}

	public void delete(Long id) {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		ProdottoMapper theMapper = session.getMapper(ProdottoMapper.class);
	    theMapper.delete(id);
	    session.commit();
	}
	public List<Prodotto> findAll() {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		ProdottoMapper theMapper = session.getMapper(ProdottoMapper.class);
	    List<Prodotto> ret = theMapper.findAll();
	    session.commit();
	    return ret;
	}
	public Prodotto find(Long id) {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		ProdottoMapper theMapper = session.getMapper(ProdottoMapper.class);
	    Prodotto ret = theMapper.find(id);
	    session.commit();
	    return ret;
	}

}
