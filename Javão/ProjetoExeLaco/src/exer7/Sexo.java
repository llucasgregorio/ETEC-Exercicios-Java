package exer7;

import javax.swing.JOptionPane;

public class Sexo {

	public int sexo, media, idadeM, idade1;
	public int idade,  numero, qtdHom = 0, qtdMu = 0 ;
	
	public void insereDados() {
		
		
		
		while (numero <= 999) {
			

			try {
				sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Sexo \n 1 - Masculino \n 2 - Feminino"));
	
				idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
				JOptionPane.showMessageDialog(null, "Dados" + "\nNumero :" + numero + "\nSexo :" + sexo
				+ "\nIdade :" + idade);
				if(numero== 999){
				JOptionPane.showMessageDialog(null, "Pessoa invalida...");
				imprimeDados();
				If();
				System.exit(0);
				
			}
				else{
				calculaResultados();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	public void imprimeDados() {
		
		JOptionPane.showMessageDialog(null, "A media de idades de homens �: " +media+"\n A soma das idades das mulheres �: "+idadeM);
		
	}

	public void calculaResultados() {
		if(sexo==1){
			idade1=idade1+idade;
			qtdHom=qtdHom+1;
			media = idade1 / qtdHom;
		}
		else if(sexo ==2){
			idadeM+=idade;
			qtdMu=qtdMu+1;
		}
	}
		public void If(){
			if(qtdMu<qtdHom){
				JOptionPane.showMessageDialog(null, "H� mais homens do que mulheres.");
			}
			else{
				JOptionPane.showMessageDialog(null, "H� mais mulheres do que homens.");
			}
		}
	}

	

	
		
	
	
