package pigudf;

import java.io.IOException;
import java.util.Map;
import org.apache.pig.FilterFunc;
import org.apache.pig.PigException;
import org.apache.pig.backend.executionengine.ExecException;
import org.apache.pig.data.DataBag;
import org.apache.pig.data.Tuple;
import org.apache.pig.data.DataType;




	public class myudf extends FilterFunc {
		
	@Override
	public Boolean exec(Tuple input) throws IOException 
	{
	try 
	{
	int value1 = (int)input.get(0);
	int value2 =(int)input.get(1);
	if(value2 >= (value1 * 0.8) )
	{
		return true;
		
	}
	else
		
		return false;
	
		
	} catch (ExecException ee) {
	throw ee;
	}
	}
	}

