package GUI;

public aspect Aspecto {
	pointcut success() : execution(* Boton.notificar(..) );
	after() returning() : success(){
		System.out.println(thisJoinPointStaticPart.getSignature().getName());
	}
}