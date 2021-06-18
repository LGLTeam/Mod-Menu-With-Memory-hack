package androtrainer;

public class ScannerAddress
{
	public long address;
	public String value;
	
	public ScannerAddress(long address, String value)
	{
		this.address = address;
		this.value = value;
	}
	
	
	
	public ScannerAddress()
	{
		this.address = 0;
		this.value = null;
	}

	@Override
	public String toString()
	{
		String ret = 
		super.toString()+":"+
		"\n\t[address]: 0x"+Long.toHexString(this.address)+
		"\n\t[value]: "+value;
		return ret;
	};
	
	
	
}
