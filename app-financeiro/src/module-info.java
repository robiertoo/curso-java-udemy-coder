module app.financeiro {
	requires java.base; //default
//	requires app.calculo;
	requires app.api;
	uses br.com.cod3r.app.Calculadora;
}