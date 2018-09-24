package mokito;

public class ComputeImplementation implements iCompute 
{
	iCompute obj;
	public int squareVar(int var) {
		
		return obj.squareVar(var);
	}

	public int multiply(int x, int y) 
	{
		
		return obj.multiply(x, y);
	}
	public void setObj(iCompute obj)
	{
		this.obj=obj;
	}

}
