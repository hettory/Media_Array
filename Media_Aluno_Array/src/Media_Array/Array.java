package Media_Array;

public class Array {

	public static void main(String[] args) {
		
		double [][] notasAlunos = new double [3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 9;
		notasAlunos[2][1] = 8;
		notasAlunos[2][2] = 7;
		notasAlunos[2][3] = 9;
		
		for(int i=0; i<notasAlunos.length; i++) {
			//System.out.print(notasAlunos[i]+"");
			for(int j=0; j<notasAlunos[i].length; j++) {
				System.out.println(notasAlunos[i][j] + " ");
				
			}
			System.out.println();
		}
         
		System.out.println("Calculando a média de cada aluno");
		
		double soma;
		for(int i=0; i<notasAlunos.length; i++) {
		    
			soma = 0;
			for(int j=0; j<notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
				

			
			}
			System.out.println("Media do aluno" + "é = " + (soma/4));
	}

}
}
