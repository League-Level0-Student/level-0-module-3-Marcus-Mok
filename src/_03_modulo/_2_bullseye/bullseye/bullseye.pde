
void setup() {
 
  
  
}

void draw() {
  for(int i = 8; i >=0; i--){
if (i % 2 == 0) {
     fill(255, 0, 0);
    }
    else {
      fill(0);
    }
  
  
  ellipse(width/2, height/2, 50*i, 50*i);     
    
  

}
    
        
  
 
  
  
}
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  //Use an if statement and modulo to alternate the color of your rings.
  
  

