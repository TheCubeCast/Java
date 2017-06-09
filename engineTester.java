public class engineTester {

  public static void main(String[] args) {


    renderEngine.createDisplay();

    while(!Display.isCloseRequested()) {

      renderEngine.updateDisplay();



    }

    renderEngine.closeDisplay();

  }






}
