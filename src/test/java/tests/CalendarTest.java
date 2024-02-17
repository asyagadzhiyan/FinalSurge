package tests;

import dto.QuickAddWorkout;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalendarPage;

import java.util.Calendar;

public class CalendarTest extends BaseTest {

    @Test(description = "Add Run Quick Workout on Calendar", retryAnalyzer = Retry.class)
    public void addRunQuickWorkout() {
        QuickAddWorkout newQuickWorkout = QuickAddWorkout.builder()
                .workoutDate(CalendarPage.getTodayDate())
                .timeOfDay("4:44")
                .activityType("Run")
                .workoutName("RunTest")
                .workoutDescription("Testing Run workout")
                .distanceNumber("1")
                .distanceType("mi")
                .duration("01:20:33")
                .paceNumber("03:55")
                .paceType("min/mi")
                .howFeel("Good")
                .perEffort("2 (Light)")
                .postWorkoutNotesResults("Super")

                .showPlannedDistanceDuration(true)
                .pDistance("21")
                .pDistanceType("mi")
                .pDuration("0:19:33")

                .markAsRace(true)
                .ageGroupPlace("4")
                .overallPlace("1")

                .saveToLibrary(true)
                .build();
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        calendarPage.open();
        calendarPage.addQuickWorkoutWithButton();
        quickAddWorkoutPage.fillingFields(newQuickWorkout);
        quickAddWorkoutPage.save();
        Assert.assertEquals(calendarPage.QuickWorkOutIsDisplayed(CalendarPage.getValueByType(Calendar.DAY_OF_MONTH),
                        CalendarPage.getValueByType(Calendar.MONTH),
                        CalendarPage.getValueByType(Calendar.YEAR), newQuickWorkout.getActivityType()+":"+""+newQuickWorkout.getWorkoutName()),
                true,
                "The Run Workout isn't created");
    }

    @Test(description = "Add Bike Quick Workout on Calendar", retryAnalyzer = Retry.class)
    public void addBikeQuickWorkout() {
        QuickAddWorkout newQuickWorkout = QuickAddWorkout.builder()
                .workoutDate(CalendarPage.getTodayDate())
                .timeOfDay("4:44")
                .activityType("Bike")
                .workoutName("BikeTest")
                .workoutDescription("Testing Bike workout")
                .distanceNumber("1")
                .distanceType("mi")
                .duration("01:10:10")
                .paceNumber("02:15")
                .paceType("min/mi")
                .howFeel("Good")
                .perEffort("4 (Moderate)")
                .postWorkoutNotesResults("Easy")

                .showPlannedDistanceDuration(true)
                .pDistance("21")
                .pDistanceType("mi")
                .pDuration("0:14:05")

                .markAsRace(true)
                .ageGroupPlace("4")
                .overallPlace("1")

                .saveToLibrary(true)
                .build();
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        calendarPage.open();
        calendarPage.addQuickWorkoutWithButton();
        quickAddWorkoutPage.fillingFields(newQuickWorkout);
        quickAddWorkoutPage.save();
        Assert.assertEquals(calendarPage.QuickWorkOutIsDisplayed(CalendarPage.getValueByType(Calendar.DAY_OF_MONTH),
                        CalendarPage.getValueByType(Calendar.MONTH),
                        CalendarPage.getValueByType(Calendar.YEAR), "Bike"),
                true,
                "The Bike Workout isn't created");
    }

    @Test(description = "Add Swim Quick Workout on Calendar", retryAnalyzer = Retry.class)
    public void addSwimQuickWorkout() {
        QuickAddWorkout newQuickWorkout = QuickAddWorkout.builder()
                .workoutDate(CalendarPage.getTodayDate())
                .timeOfDay("4:44")
                .activityType("Swim")
                .workoutName("SwimTest")
                .workoutDescription("Testing Swim workout")
                .distanceNumber("1")
                .distanceType("mi")
                .duration("01:10:10")
                .paceNumber("02:15")
                .paceType("min/mi")
                .howFeel("Good")
                .perEffort("1 (Very Light)")
                .postWorkoutNotesResults("Easy")

                .showPlannedDistanceDuration(true)
                .pDistance("21")
                .pDistanceType("mi")
                .pDuration("0:14:05")

                .markAsRace(true)
                .ageGroupPlace("4")
                .overallPlace("1")

                .saveToLibrary(true)
                .build();
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        calendarPage.open();
        calendarPage.addQuickWorkoutWithButton();
        quickAddWorkoutPage.fillingFields(newQuickWorkout);
        quickAddWorkoutPage.save();
        Assert.assertEquals(calendarPage.QuickWorkOutIsDisplayed(CalendarPage.getValueByType(Calendar.DAY_OF_MONTH),
                        CalendarPage.getValueByType(Calendar.MONTH),
                        CalendarPage.getValueByType(Calendar.YEAR), "Swim"),
                true,
                "The Swim Workout isn't created");
    }

    @Test(description = "Add RecoveryRehab Quick Workout on Calendar", retryAnalyzer = Retry.class)
    public void addRecoveryRehabQuickWorkout() {
        QuickAddWorkout newQuickWorkout = QuickAddWorkout.builder()
                .workoutDate(CalendarPage.getTodayDate())
                .timeOfDay("4:44")
                .activityType("Recovery/Rehab")
                .workoutName("RecoveryRehab test")
                .workoutDescription("Testing RecoveryRehab workout")
                .distanceNumber("1")
                .distanceType("mi")
                .duration("01:10:10")
                .paceNumber("02:15")
                .paceType("min/mi")
                .howFeel("Good")
                .perEffort("1 (Very Light)")
                .postWorkoutNotesResults("Easy")

                .showPlannedDistanceDuration(true)
                .pDistance("21")
                .pDistanceType("mi")
                .pDuration("0:14:05")

                .markAsRace(true)
                .ageGroupPlace("4")
                .overallPlace("1")

                .saveToLibrary(true)
                .build();
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        calendarPage.open();
        calendarPage.addQuickWorkoutWithButton();
        quickAddWorkoutPage.fillingFields(newQuickWorkout);
        quickAddWorkoutPage.save();
        Assert.assertEquals(calendarPage.QuickWorkOutIsDisplayed(CalendarPage.getValueByType(Calendar.DAY_OF_MONTH),
                        CalendarPage.getValueByType(Calendar.MONTH),
                        CalendarPage.getValueByType(Calendar.YEAR), "Recovery/Rehab"),
                true,
                "The RecoveryRehab Workout isn't created");
    }

    @Test(description = "Add StrengthTraining Quick Workout on Calendar", retryAnalyzer = Retry.class)
    public void addStrengthTrainingQuickWorkout() {
        QuickAddWorkout newQuickWorkout = QuickAddWorkout.builder()
                .workoutDate(CalendarPage.getTodayDate())
                .timeOfDay("7:25")
                .activityType("Strength Training")
                .workoutName("StrengthTraining test")
                .workoutDescription("Testing StrengthTraining workout")
                .distanceNumber("1")
                .distanceType("mi")
                .duration("00:45:55")
                .paceNumber("02:15")
                .paceType("min/mi")
                .howFeel("Poor")
                .perEffort("10 (Max Effort)")
                .postWorkoutNotesResults("Easy")

                .showPlannedDistanceDuration(true)
                .pDistance("21")
                .pDistanceType("mi")
                .pDuration("0:14:05")

                .markAsRace(true)
                .ageGroupPlace("4")
                .overallPlace("1")

                .saveToLibrary(true)
                .build();
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        calendarPage.open();
        calendarPage.addQuickWorkoutWithButton();
        quickAddWorkoutPage.fillingFields(newQuickWorkout);
        quickAddWorkoutPage.save();
        Assert.assertEquals(calendarPage.QuickWorkOutIsDisplayed(CalendarPage.getValueByType(Calendar.DAY_OF_MONTH),
                        CalendarPage.getValueByType(Calendar.MONTH),
                        CalendarPage.getValueByType(Calendar.YEAR), "Strength Training"),
                true,
                "The StrengthTraining Workout isn't created");
    }

    @Test(description = "Remove Quick Workout from Calendar", retryAnalyzer = Retry.class)
    public void deleteWorkoutFromCalendar() {
        QuickAddWorkout newQuickWorkout = QuickAddWorkout.builder()
                .workoutDate(CalendarPage.getTodayDate())
                .activityType("Cross Training")

                .build();
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        calendarPage.open();
        calendarPage.addQuickWorkoutWithButton();
        quickAddWorkoutPage.fillingFields(newQuickWorkout);
        quickAddWorkoutPage.save();
        calendarPage.deleteWorkoutFromCalendar(CalendarPage.getValueByType(Calendar.DAY_OF_MONTH),
                CalendarPage.getValueByType(Calendar.MONTH),
                CalendarPage.getValueByType(Calendar.YEAR), "Cross Training");
        Assert.assertEquals(calendarPage.QuickWorkOutIsDisplayed(CalendarPage.getValueByType(Calendar.DAY_OF_MONTH),
        CalendarPage.getValueByType(Calendar.MONTH),
        CalendarPage.getValueByType(Calendar.YEAR), "Cross Training"), false, "The workout isn't deleted");
    }
}