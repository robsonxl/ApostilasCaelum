package introduction;

public class FirstClass {

	public static void main(String[] args) {
		System.out.print("MY FIRST PROGRAM\n MY SECONT PROGRAM");
		System.out.print("MY THIRD PROGRAM\n");
		float total = variaveisTiposPrimitivos.balancoTrimestral(1500, 2300, 1700);
		System.out.println("BAL�O DO PRIMEIRO TRIMESTRE"+":"+ total);
		System.out.println(" M�DIA TRIMESTRAL"+":" + variaveisTiposPrimitivos.mediaMensalTrimetral(total));
	}

}
