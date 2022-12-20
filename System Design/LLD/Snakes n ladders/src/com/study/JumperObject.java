package com.study;

 public class JumperObject {
     private JumperType jumperType;
     private Position startPosition;
     private Position endPosition;
     public void jump(Player player)
     {
         System.out.println(player.getName()+" has landed on "+this.jumperType+" , jumped to "+this.endPosition.toString());
         player.setPosition(this.endPosition);
     }
     public JumperType getJumperType() {
         return jumperType;
     }

     public void setJumperType(JumperType jumperType) {
         this.jumperType = jumperType;
     }

     public Position getStartPosition() {
         return startPosition;
     }

     public void setStartPosition(Position startPosition) {
         this.startPosition = startPosition;
     }

     public Position getEndPosition() {
         return endPosition;
     }

     public void setEndPosition(Position endPosition) {
         this.endPosition = endPosition;
     }
}
