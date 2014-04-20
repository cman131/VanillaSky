
public abstract class Position {
		private int x =-1;
		private int y = -1;
		public Position ()
		{
			
		}
		
		public Position(int paramX, int paramY)
		{
			this.x = paramX;
			this.y = paramY;
		}
		
		public Position(Position other)
		{
			this.x=other.x;
			this.y=other.y;
		}
		
		public int getX()
		{
			return this.x;
		}
		
		public int getY()
		{
			return this.y;
		}
		
		public boolean setX(int argX)
		{
			boolean value = false;
			if(argX>=0)
			{
				this.x = argX;
				value = true;
			}
			return value;
		}
		
		public boolean setY(int argY)
		{
			boolean value = false;
			if(argY>=0)
			{
				this.y = argY;
				value = true;
			}
			return value;
		}
}
