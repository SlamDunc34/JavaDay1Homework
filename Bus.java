public class Bus{
  private int number;

  //passenger was accidenlty called bus
  private Passenger[] seats;
  
  public Bus(int number){
    this.number = number;
    this.seats = new Passenger[20];
  }
  public int getNumber(){
    return this.number;
  }

  public void board(Passenger passenger){

    if(isBusFull()){
      return;
    }

    int passengerCount = passengerCount();
    this.seats[passengerCount] = passenger;
  }


  
  public boolean isBusFull(){
    return passengerCount() == seats.length;
  }

  public int passengerCount(){
    int count = 0;
    for(Passenger passenger : this.seats){
      if(passenger != null){
        count++;
      }
    }

    return count;
  }
}
