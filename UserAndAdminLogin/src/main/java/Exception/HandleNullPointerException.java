package Exception;

@SuppressWarnings("serial")
public class HandleNullPointerException extends RuntimeException{

	public HandleNullPointerException()
	{
		super("Message");
	}
	
	public HandleNullPointerException(String message)
	{
		super(message);
		System.out.print(message);
	}
}
