package spring5_basic_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		Greeter gc1 = new Greeter();
		Greeter gc2 = new Greeter();
		
		System.out.printf("(gc1==gc2) = %s%n",gc1==gc2);
		
		try(AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppContext.class)){
			Greeter g= ctx.getBean("greeter",Greeter.class);
			Greeter g2 = ctx.getBean("greeter",Greeter.class);
			
			//g와 g2는 같은객체(싱글턴 패턴)
			System.out.printf("(g==g2) = %s%n",g==g2);
			
			String msg = g.greet("스프링");
			System.out.println(msg);
			ctx.close();
			
			//String.format("%s,안녕하세요",guest
		}
	}
}
