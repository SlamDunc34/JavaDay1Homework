import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Passenger passenger;

  @Before 
  public void before() {
    bus = new Bus(44);
    passenger = new Passenger();
  }

  @Test
  public void hasNumber(){
    assertEquals(44, bus.getNumber()); 
  }

  @Test
  public void busStartsEmpty(){
    assertEquals(0, bus.passengerCount()); 
  }

  @Test
  public void canBoardPassengers(){
    this.bus.board(this.passenger);
    assertEquals(1, this.bus.passengerCount());
  }

  @Test
  public void cannotBoardPassengerWhenBusFull(){
    for(int i = 0; i < 20; i++){
      this.bus.board(passenger);
    }
    assertEquals(20, this.bus.passengerCount());
  }

  @Test
  public void busIsFull(){
    for(int i = 0; i < 20; i++){
      this.bus.board(this.passenger);
    }
    assertEquals(true, this.bus.isBusFull());
  }

}
