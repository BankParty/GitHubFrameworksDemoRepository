package reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {
	public static void main(String[]args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		String operation="mult";
		int x=100;
		int y=20;
		
		
		Operations op = new Operations();
		Method m = op.getClass().getMethod(operation, int.class,int.class);
		m.invoke(op,x,y);
		/*if(operation.equals("add"))
			op.add(x, y);
		else if(operation.equals("diff"))
			op.diff(x, y);
		else if(operation.equals("mult"))
			op.mult(x, y);
		else if(operation.equals("div"))
			op.div(x, y);
		*/
	}

}
