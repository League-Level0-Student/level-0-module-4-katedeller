void setup(){
size(1024,768);}
void draw(){
  background(0,0,0);
ellipse(200,200,100,100);
ellipse(400,200,100,100);
if((mouseX<250 && mouseX>150) && (mouseY<250 && mouseY>150)){
ellipse(mouseX,mouseY,25,25);
ellipse(mouseX+200,mouseY,25,25);}
else if(mouseX<150 && mouseY<250 && mouseY>150){ellipse(150,mouseY,25,25);}
else if(mouseX>250 && mouseY>150 && mouseY<250){ellipse(250,mouseY,25,25);}
else if(mouseY>250 && mouseX>150 && mouseX<250){ellipse(mouseX,250,25,25);}
else if(mouseY<150 && mouseX>150 && mouseX<250){ellipse(mouseX,150,25,25);}
}