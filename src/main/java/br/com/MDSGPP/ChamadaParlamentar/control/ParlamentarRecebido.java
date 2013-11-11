package br.com.MDSGPP.ChamadaParlamentar.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.MDSGPP.ChamadaParlamentar.model.Deputados;
import br.com.MDSGPP.ChamadaParlamentar.model.Estatistica;


public class ParlamentarRecebido extends javax.servlet.http.HttpServlet {


        private static final long serialVersionUID = 1L;

        protected void service (HttpServletRequest request, HttpServletResponse response) {
                String nome = request.getParameter("nome");

                Deputados deputado = null;

                deputado = DeputadosControl.verificaExistencia(nome);
                
                RequestDispatcher rd;
                if(deputado != null) {
                        Estatistica estatistica = EstatisticaControl.
                                        gerarEstatisticas(EstatisticaControl.
                                                        arrumarNomePesquisa(deputado));
                        
                        request.setAttribute("estatistica", estatistica);
                                       
                         rd = request.getRequestDispatcher("/MostrarEstatisticaDeputado.jsp");
                         System.out.println(estatistica);
                }
                else {
                         rd = request.getRequestDispatcher("/DeputadoNaoEncontrado.jsp");
                }
                
                try {
                        rd.forward(request, response);
                } catch (ServletException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }

        }        
}