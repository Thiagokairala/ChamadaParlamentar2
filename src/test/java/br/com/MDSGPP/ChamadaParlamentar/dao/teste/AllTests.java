package br.com.MDSGPP.ChamadaParlamentar.dao.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TesteConnectionFactory.class, TesteDeputadoDao.class })
public class AllTests {

}
