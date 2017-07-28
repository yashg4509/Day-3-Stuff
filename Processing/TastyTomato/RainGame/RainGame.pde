int yPos = 80;
int randomNumber;
int score;
void checkCatch(int x) {
  if( (randomNumber > mouseX && randomNumber < mouseX + 100) && (yPos > 650 && yPos < 750)) {
    yPos = 80;
    randomNumber = (int) random(900);
    score++;
  }
  else if (score > 0) {
    score--;
  }
  println("Your score is now: " + score);
}
void setup() {
  size(900, 720);
}

void draw() {
  background(100, 100, 100);
  ellipse(randomNumber, yPos, 30, 30);
  fill(0, 0, 255);
  noStroke();
  yPos = yPos +2;
  checkCatch(randomNumber);
  if (yPos > 720) {
    yPos = 80;
      randomNumber = (int) random(900);

  }
 
  rect(mouseX, 650, 70, 100);
  fill(0);
  textSize(16);
  text("Score: " + score, 20, 20);
  
  if(score > 5) {
    text("Congratulations! You won!" , 500 , 500);
  }
}