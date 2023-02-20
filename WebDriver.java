public interface WebDriver {
    void open ();
    void close ();
    String getTitle ();
}
interface TakesScreenShot {
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver,TakesScreenShot{
    void navigate();
}
class Chrome implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("chrome opens browser");
    }
    @Override
    public void close() {
        System.out.println("chrome closes browser");
    }
    @Override
    public String getTitle() {
        return "the title of the chrome browser" ;
    }
    @Override
    public void getScreenshot() {
        System.out.println("chrome takes a screenshot");
    }
    @Override
    public void navigate() {
        System.out.println("chrome navigates to website ");
    }
}
class FirefoxDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("mozilla opens browser");
    }
    @Override
    public void close() {
        System.out.println("mozilla closes browser");
    }
    @Override
    public String getTitle() {
        return "the title of the mozilla browser";
    }
    @Override
    public void getScreenshot() {
        System.out.println("mozilla takes a screenshot");
    }
    @Override
    public void navigate() {
        System.out.println("mozilla navigates to website");
    }
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("safari opens browser");
    }
    @Override
    public void close() {
        System.out.println("safari closes browser");
    }
    @Override
    public String getTitle() {
        return  "the title of the mozilla browser";
    }
    @Override
    public void getScreenshot() {
        System.out.println("safari takes a screenshot");
    }
    @Override
    public void navigate() {
        System.out.println("safari navigates to website");
    }


}

