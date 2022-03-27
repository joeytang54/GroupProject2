
    interface WebDriver{
        void open();
        void close();
        String getTitle();
    }
    interface TakeScreenshot{
        void getScreenshot();
    }
    interface RemoteWebDriver extends WebDriver, TakeScreenshot{
    void navigate();
    }

    class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open(){
        System.out.println("Open website from Chrome");
    }
    @Override
    public void close(){
        System.out.println("Close website from Chrome");
    }
    @Override
    public String getTitle(){
        System.out.println("Title of website");
        return "Title of website";
    }
    @Override
    public void getScreenshot() {
        System.out.println("Take screenshot");
        }
    @Override
    public void navigate() {
         System.out.println("Navigate website in Chrome");
        }
    }
    class FireFoxDriver implements RemoteWebDriver{
        @Override
        public void open(){
            System.out.println("Open website from FireFox");
        }
        @Override
        public void close(){
            System.out.println("Close website from FireFox");
        }
        @Override
        public String getTitle(){
            System.out.println("Title of website");
            return "Title of website";
        }
        @Override
        public void getScreenshot() {
            System.out.println("Take screenshot");
        }
        @Override
        public void navigate() {
            System.out.println("Navigate website in FireFox");
        }
    }
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open(){
        System.out.println("Open website from Safari");
    }
    @Override
    public void close(){
        System.out.println("Close website from Safari");
    }
    @Override
    public String getTitle(){
        System.out.println("Title of website");
        return "Title of website";
    }
    @Override
    public void getScreenshot() {
        System.out.println("Take screenshot");
    }
    @Override
    public void navigate() {
        System.out.println("Navigate website in Safari");
    }
}
    public class Task5 {
        public static void main(String[] args) {
            RemoteWebDriver [] drivers= {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
            for (RemoteWebDriver driver: drivers){
                driver.open();
                driver.close();
                driver.getTitle();
                driver.getScreenshot();
                driver.navigate();
            }
        }
    }


