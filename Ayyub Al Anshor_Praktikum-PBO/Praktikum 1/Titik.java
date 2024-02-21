class Titik
{
	double absis, ordinat;
	static double counterTitik;
	
	Titik()
	{
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double a, double b)
	{
		absis = a;
		ordinat = b;
		counterTitik++;
	}
	
	void setAbsis(double abs)
	{
		absis = abs;
	}
	
	double getAbsis()
	{
		return absis;
	}
	
	void setOrdinat(double ord)
	{
		ordinat = ord;
	}
	
	double getOrdinat()
	{
		return ordinat;
	}
	
	static double getCounter()
	{
		return counterTitik;
	}

}