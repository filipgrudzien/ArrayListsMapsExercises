package execution;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import testing.DuplicatesTester;
import testing.MinMaxTester;
import testing.MissingValueTester;

public class TestsExecutor {
	
	public static void duplicatesRun() {

		Result result = JUnitCore.runClasses(DuplicatesTester.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

	}
	
	public static void missingValueRun() {

		Result result = JUnitCore.runClasses(MissingValueTester.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

	}
	
	public static void minMaxRun() {

		Result result = JUnitCore.runClasses(MinMaxTester.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

	}
}
