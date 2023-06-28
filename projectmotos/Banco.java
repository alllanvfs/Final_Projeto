//ALLAN VINICIOS FERRAZ SANTOS RA:2465272

package com.mycompany.projectmotos;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Banco
{   

    //DECLARACAO obj e lista 
    
    static List<Esportiva> bancoEsportiva = new ArrayList<>();
    static List<Offroad> bancoOffroad = new ArrayList<>();
    static List<Touring> bancoTouring = new ArrayList<>();
    
    private static Banco bancoMotorsUnico; 
    
    public static Banco getBancoMotors(){
      if(bancoMotorsUnico == null){
        bancoMotorsUnico = new Banco();
      }
      
      return bancoMotorsUnico;
    }
    
    public List<Esportiva> getBdEsportiva(){
      return bancoEsportiva;
    }
    
    public List<Offroad> getBdOffroad(){
      return bancoOffroad;
    }
    
    public List<Touring> getBdTouring(){
      return bancoTouring;
    }

    //CADASTRO DE MOTO ESPORTIVA

    public static Esportiva cadEsportiva(Esportiva m1)
    {   
      if(consEsportiva(m1) == null){
        bancoEsportiva.add(m1);
        return m1;
      }
      return null;  
    }

    //CADASTRO DE MOTO OFFROAD
    
    public static Offroad cadOffroad(Offroad m2)
    {   
        if(consOffroad(m2) == null){
          bancoOffroad.add(m2);
          return m2;
        }
        return null;
    }

    //CADASTRO DE MOTO TOURING
    
    public static Touring cadTouring(Touring m3)
    {
        if(consTouring(m3) == null){
          bancoTouring.add(m3);
          return m3;
        }
        return null;
    }

    //CONSULTAR PLACA ESPORTIVO

        public static Esportiva consEsportiva(Esportiva m7)
        {
            for(int i = 0; i < bancoEsportiva.size(); i++)
            {
                if(m7.getPlaca().equalsIgnoreCase(bancoEsportiva.get(i).getPlaca()))
                    {
                        return bancoEsportiva.get(i);
                    }
            }
            return null;
        }

    //CONSULTAR Placa OFFROAD

    public static Offroad consOffroad(Offroad m8)
    {
        for(int j = 0; j < bancoOffroad.size(); j++)
        {
            if(m8.getPlaca().equalsIgnoreCase(bancoOffroad.get(j).getPlaca()))
                {
                    return bancoOffroad.get(j);
                }
        }
        return null;
    }

    //CONSULTAR Placa TOURING

    public static Touring consTouring(Touring m9)
    {
        for(int k = 0; k < bancoTouring.size(); k++)
        {
            if(m9.getPlaca().equalsIgnoreCase(bancoTouring.get(k).getPlaca()))
                {
                    return bancoTouring.get(k);
                }
        }
        return null;
    }

    //ALTERAR ESPORTIVO 
    public static Esportiva alterarEsportiva(Esportiva m10)
    {
        for(int i = 0; i < bancoEsportiva.size(); i++)
        {
            if(m10.getPlaca().equalsIgnoreCase(bancoEsportiva.get(i).getPlaca()))
            {   
              
            
                String nMarca = JOptionPane.showInputDialog(null, "Nova marca:", "Alteração de Marca", 3);
                String nModelo = JOptionPane.showInputDialog(null, "Novo modelo:", "Alteração de Modelo", 3);
                String nCor = JOptionPane.showInputDialog(null, "Nova cor:", "Alteração de Cor", 3);
                
                int nPeso = Integer.parseInt(JOptionPane.showInputDialog(null, "Novo Peso:", "Alteração de Peso", 3));
                int nValor = Integer.parseInt(JOptionPane.showInputDialog(null, "Novo Valor:", "Alteração de Valor", 3));
                int nCilindrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Nova Cilindrada:", "Alteração de Cilindrada", 3));
                int nFreio = Integer.parseInt(JOptionPane.showInputDialog(null, "Novo Freio:\n1 - Disco\n2 - ABS\n3 - Tambor", "Alteração de Freio", 3));
                int nVelocidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Nova Velocidade de 0 a 100:", "Alteração de Velocidade", 3));
                
                m10.setMarca(nMarca);
                m10.setModelo(nModelo);
                m10.setCor(nCor);
                m10.setPeso(nPeso);
                m10.setValor(nValor);
                m10.setCilindradas(nCilindrada);
                m10.setSistema_Freio(nFreio);
                m10.setVelocidade_zero_cem(nVelocidade);
                
                bancoEsportiva.set(i, m10);
                
                return bancoEsportiva.get(i);
            }
        }
        return null;

    }//fim do alt esportivo

    public static Offroad alterarOffroad(Offroad m11)
    {
        for(int i = 0; i < bancoOffroad.size(); i++)
        {
            if(m11.getPlaca().equalsIgnoreCase(bancoOffroad.get(i).getPlaca()))
            {

                String nMarca = JOptionPane.showInputDialog(null, "Nova marca:", "Alteração de Marca", 3);
                String nModelo = JOptionPane.showInputDialog(null, "Novo modelo:", "Alteração de Modelo", 3);
                String nCor = JOptionPane.showInputDialog(null, "Nova cor:", "Alteração de Cor", 3);
                
                int nPeso = Integer.parseInt(JOptionPane.showInputDialog(null, "Novo Peso:", "Alteração de Peso", 3));
                int nValor = Integer.parseInt(JOptionPane.showInputDialog(null, "Novo Valor:", "Alteração de Valor", 3));
                int nCilindrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Nova Cilindrada:", "Alteração de Cilindrada", 3));
                int nAltura = Integer.parseInt(JOptionPane.showInputDialog(null, "Nova Altura minima:", "Alteração de Altura minima", 3));
                
                m11.setMarca(nMarca);
                m11.setModelo(nModelo);
                m11.setCor(nCor);
                m11.setPeso(nPeso);
                m11.setValor(nValor);
                m11.setCilindradas(nCilindrada);
                m11.setAltura_minima_solo(nAltura);
                
                bancoOffroad.set(i, m11);
                
                return bancoOffroad.get(i);
            }
        }
        return null;
    }//fim do alt offroad

    public static Touring alterarTouring(Touring m12)
    {
        for(int i = 0; i < bancoTouring.size(); i++)
        {
            if(m12.getPlaca().equalsIgnoreCase(bancoTouring.get(i).getPlaca()))
            {
              
                String nMarca = JOptionPane.showInputDialog(null, "Nova marca:", "Alteração de Marca", 3);
                String nModelo = JOptionPane.showInputDialog(null, "Novo modelo:", "Alteração de Modelo", 3);
                String nCor = JOptionPane.showInputDialog(null, "Nova cor:", "Alteração de Cor", 3);
                
                int nPeso = Integer.parseInt(JOptionPane.showInputDialog(null, "Novo Peso:", "Alteração de Peso", 3));
                int nValor = Integer.parseInt(JOptionPane.showInputDialog(null, "Novo Valor:", "Alteração de Valor", 3));
                int nCilindrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Nova Cilindrada:", "Alteração de Cilindrada", 3));
                int nTanque = Integer.parseInt(JOptionPane.showInputDialog(null, "Nova Capacidade de tanque:", "Alteração da capacidade do tanque ", 3));
                
                m12.setMarca(nMarca);
                m12.setModelo(nModelo);
                m12.setCor(nCor);
                m12.setPeso(nPeso);
                m12.setValor(nValor);
                m12.setCilindradas(nCilindrada);
                m12.setCapacidade_tanque(nTanque);
                
                bancoTouring.set(i, m12);
                
                return bancoTouring.get(i);
                
            }
        }
        return null;
    }//fim do alt offroad

    //deletar esportiva

    public static Esportiva deletarEsportiva(Esportiva m13)
    {
        for(int i = 0; i < bancoEsportiva.size(); i++)
        {
            if(m13.getPlaca().equalsIgnoreCase(bancoEsportiva.get(i).getPlaca()))
            {
              bancoEsportiva.remove(bancoEsportiva.get(i));
              return null;
            }
        }
        return m13;
    }

    //deletar Offroad

    public static Offroad deletarOffroad(Offroad m14)
    {
        for(int i = 0; i < bancoOffroad.size(); i++)
        {
            if(m14.getPlaca().equalsIgnoreCase(bancoOffroad.get(i).getPlaca()))
            {
              bancoOffroad.remove(bancoOffroad.get(i));  
              return null;
            }
        }
        return m14;
    }

    //deletar Turing

    public static Touring deletarTuring(Touring m15)
    {
        for(int i = 0; i < bancoTouring.size(); i++)
        {
            if(m15.getPlaca().equalsIgnoreCase(bancoTouring.get(i).getPlaca()))
            {
              bancoTouring.remove(bancoTouring.get(i));
              return null;
            }
        }
        return m15;
    }

}
