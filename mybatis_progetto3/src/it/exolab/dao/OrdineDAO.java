package it.exolab.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import it.exolab.mapper.OrdineMapper;
import it.exolab.mapper.ProdottoMapper;
import it.exolab.model.Ordine;
import it.exolab.model.Prodotto;
import it.exolab.util.MyBatisUtils;

public class OrdineDAO {
private static OrdineDAO instance;
	
	private OrdineDAO() {
		
	}
	public static OrdineDAO getInstance() {
		if(instance==null)
			instance = new OrdineDAO();
		return instance;
	}
	
	public void insert(Ordine model) {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		OrdineMapper theMapper = session.getMapper(OrdineMapper.class);
		ProdottoMapper prodottoMapper  = session.getMapper(ProdottoMapper.class);
		Prodotto prodotto = prodottoMapper.find(model.getId_prodotto());
		model.setPrezzo_acquisto(prodotto.getPrezzo());
	    theMapper.insert(model);
	    prodotto.setQuantita_disponibile(prodotto.getQuantita_disponibile()- model.getQuantita_acquista());
	    
	    prodottoMapper.updateQuantita(prodotto);
	    session.commit();
	}
	
	public List<Ordine> findAll() {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		OrdineMapper theMapper = session.getMapper(OrdineMapper.class);
	    List<Ordine> ret = theMapper.findAll();
	    session.commit();
	    return ret;
	}
	

	public List<Ordine> findAllJoinProdottoECliente() {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		OrdineMapper theMapper = session.getMapper(OrdineMapper.class);
	    List<Ordine> ret = theMapper.findAllJoinProdottoECliente();
	    session.commit();
	    return ret;
	}
	public void delete(Long id) {
		SqlSession session = MyBatisUtils.getSqlSessionFactory().openSession();
		OrdineMapper theMapper = session.getMapper(OrdineMapper.class);
	    theMapper.delete(id);
	    session.commit();
	    
	}
}
