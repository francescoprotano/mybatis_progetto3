ISTRUZIONI:

	- usare il file install.sql per generare il database
	
PROBLEMI DA RISOLVERE:

	- Eseguendo la classe Programma ho questo errore
	
		Exception in thread "main" org.apache.ibatis.binding.BindingException: Type interface it.exolab.mapper.OrdineMapper is not known to the MapperRegistry.
	at org.apache.ibatis.binding.MapperRegistry.getMapper(MapperRegistry.java:47)
	at org.apache.ibatis.session.Configuration.getMapper(Configuration.java:899)
	at org.apache.ibatis.session.defaults.DefaultSqlSession.getMapper(DefaultSqlSession.java:291)
	at it.exolab.dao.OrdineDAO.insert(OrdineDAO.java:27)
	at it.exolab.controller.OrdineController.insert(OrdineController.java:16)
	at it.exolab.Programma.main(Programma.java:19)

		
		
	
	- Ho sistemato il punto 1, ma quando eseguo la classe TestCancellazione mi da un errore. Perchè?
	
	- Ho sistemato il punto 2, ma quando eseguo la classe TestOrdineDAO qualacosa non funziona. Perchè?
	
	
	
	  