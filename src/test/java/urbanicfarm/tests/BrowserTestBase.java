package urbanicfarm.tests;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import urbanicfarm.config.TestResultLoggerExtension;
import urbanicfarm.driver.DriverFactory;
import urbanicfarm.driver.DriverFactoryImplementation;


import java.util.concurrent.TimeUnit;

@SpringBootTest
@ExtendWith(TestResultLoggerExtension.class)
public class BrowserTestBase {

    protected final Actions actions = new Actions(DriverFactoryImplementation.getInstance().getDriver());
    protected static final Logger LOG = LoggerFactory.getLogger(BrowserTestBase.class);
    protected final DriverFactory webDriverForTest = new DriverFactoryImplementation();

   @Autowired
    protected PageFactory pageFactory;

    @Before
    public void before() {
        LOG.info("before method initialized.. thread ID => " + Thread.currentThread().getId());
        webDriverForTest.getDriver().manage().timeouts().implicitlyWait(Integer.MAX_VALUE, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown () {
        LOG.info("tear down method worked.. thread ID =>  " + Thread.currentThread().getId());
        webDriverForTest.removeDriver();
    }



}
