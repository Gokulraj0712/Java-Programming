package gokulrajVenugopal_COMP228Lab1_Exercise1;

public class Singers 
	{
		//5 instance variables
		private int    singerId;
		private String singerName;
		private String singerAddress;
		private String singerDOB;
		private int    numberOfAlbumsPublished;
		   
		//constructor with 0 argument
		public Singers()
		  	{	
		   	}
		
		//constructor with 1 argument
		public Singers(int sId)
			{
		    	singerId = sId;	
		    }
		
		//constructor with 2 arguments
		public Singers(int sId, String sName)
		    {
		    	singerId   = sId;	
		    	singerName = sName;
		    }
		
		//constructor with 3 arguments
		public Singers(int sId, String sName, String sAddress)
		    {
		    	singerId      = sId;	
		    	singerName    = sName;
		    	singerAddress = sAddress;
		    }
		
		//constructor with 4 arguments
		public Singers(int sId, String sName,String sAddress, String sDob)
		    {
		    	singerId      = sId;	
		    	singerName    = sName;
		    	singerAddress = sAddress;
		    	singerDOB     = sDob;
		    }
		
		//constructor with 5 arguments
		public Singers(int sId, String sName, String sAddress, String sDob, int sNumber)
		    {
		    	singerId                = sId;	
		    	singerName              = sName;
		    	singerAddress           = sAddress;
		    	singerDOB               = sDob;
		    	numberOfAlbumsPublished = sNumber;
		    }
		
		//setter methods to set all the values of the instance variables at once.
		public void setId(int sId)
		    {
		    	singerId = sId;
		    }
		public void setName(String sName)
			{
				singerName = sName;
			}
		public void setAddress(String sAddress)
			{
				singerAddress = sAddress;
			}
		public void setDob(String sDob)
			{
				singerDOB  = sDob; 
			}
		public void setNumberOfAlbums(int sNumber)
			{
				numberOfAlbumsPublished = sNumber;
			}

		//setter method to set the values of individual instance variables of the singer object.
		public void setAllDetails(int sId, String sName, String sAddress, String sDob, int sNumber)
			{
		    	singerId                = sId;	
		    	singerName              = sName;
		    	singerAddress           = sAddress;
		    	singerDOB               = sDob;
		    	numberOfAlbumsPublished = sNumber;  	   
			}
		
		//getter methods to get the current individual values of each instance variables of the Singer object.
		public int getId()
		    {
		    	return singerId; 
		    }
		public String getName()
			{ 
				return singerName; 
			}
		public String getAddress()
			{ 
				return singerAddress;
			}
		public String getDob()
			{ 
				return singerDOB; 
			}
		public int getNumberOfAlbums()
			{ 
				return numberOfAlbumsPublished; 
			}
	}
