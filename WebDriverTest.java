public class WebDriverTest {
    public static void main(String[] args) {

        RemoteWebDriver[] driver={new Chrome(),new FirefoxDriver(),new SafariDriver()};
          for (RemoteWebDriver drivers:driver){
              drivers.open();
              drivers.navigate();
              System.out.println(drivers.getTitle());
              drivers.getScreenshot();
              drivers.close();
          }
    }
}
