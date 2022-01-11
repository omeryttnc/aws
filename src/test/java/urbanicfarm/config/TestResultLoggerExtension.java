package urbanicfarm.config;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import urbanicfarm.driver.DriverFactoryImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestResultLoggerExtension implements TestWatcher, AfterAllCallback {


    Logger LOG = LoggerFactory.getLogger(TestResultLoggerExtension.class);
    List<TestResultStatus> testResultsStatus = new ArrayList<>();



    private enum TestResultStatus {
        SUCCESSFUL, ABORTED, FAILED, DISABLED;
    }

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        LOG.info("Test Disabled for urbanicfarm.tests.suite1.test {}: with reason :- {}", context.getDisplayName(), reason.orElse("No reason"));
        testResultsStatus.add(TestResultStatus.DISABLED);
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        LOG.info("Test Successful for urbanicfarm.tests.suite1.test {}: ", context.getDisplayName() +   " ***  " + Thread.currentThread().getId());
        testResultsStatus.add(TestResultStatus.SUCCESSFUL);
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        LOG.info("Test Aborted for urbanicfarm.tests.suite1.test {}: ", context.getDisplayName());
        testResultsStatus.add(TestResultStatus.ABORTED);
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        LOG.warn("Test Failed for urbanicfarm.tests.suite1.test {}: ", context.getDisplayName());
        testResultsStatus.add(TestResultStatus.FAILED);
        DriverFactoryImplementation.getInstance().removeDriver();
    }

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        Map<TestResultStatus, Long> summary = testResultsStatus.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        LOG.info("Test result summary for {} {}", context.getDisplayName(), summary.toString());
    }



}