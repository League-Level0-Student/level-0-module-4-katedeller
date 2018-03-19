import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;
void setup() {
      PImage waldo = loadImage("waldo.jpg"); 
      size(500, 500);
      image(waldo, 0, 0);
     doh = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
     woohoo = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");
}

void draw() {
   println("X: " + mouseX + " Y: " + mouseY); 
if(mouseX==445 && mouseY==221) {  println("waldo found!") ;
     
playWoohoo();}
     
      else{ playDoh(); }
      
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}