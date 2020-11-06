package GUI;

public aspect Aspecto {
	pointcut success() : execution(* update(..) );
	after() : success(){
		System.out.println("Color");
	}
}