
public class HTree2 {
public void drawHTree(int size, int n) {
if(n==0) {
			
			
			
			
		}
		else
		{
			c.rotate(90);
			c.moveForward(size/2);
			c.rotate(270);
			c.drawForward(size/2);
			c.rotate(180);
			c.push();
			
			c.drawForward(size);
			c.push();
			c.rotate(180);
			c.moveForward(size/2);
			c.rotate(270);
			c.drawForward(size);
			c.rotate(90);
			c.moveForward(size/2);
			c.rotate(180);
			c.push();
			
			c.drawForward(size);
			c.rotate(180);
			c.push();
			c.pop();
			drawHTree(size/2, n-1);
			c.pop();
			drawHTree(size/2, n-1);
			c.pop();
			drawHTree(size/2, n-1);
			c.pop();
			drawHTree(size/2, n-1);
		}
			
		
	}
  }
  }
