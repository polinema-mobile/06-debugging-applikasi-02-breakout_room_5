package com.example.new_sample;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

    @LargeTest
    @RunWith(AndroidJUnit4.class)
    public class TesAngka {

        @Rule
        public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

        @Test
        public void tesKlikButtonSatu(){
            onView(withId(R.id.button1)).perform(click());
            onView(withId(R.id.button2)).perform(click());
            onView(withId(R.id.button3)).perform(click());
            onView(withId(R.id.button4)).perform(click());
            onView(withId(R.id.button5)).perform(click());
            onView(withId(R.id.button6)).perform(click());
            onView(withId(R.id.button7)).perform(click());
            onView(withId(R.id.button8)).perform(click());
            onView(withId(R.id.button9)).perform(click());
            onView(withId(R.id.button0)).perform(click());
            onView(withId(R.id.input)).check(matches(withText("1234567890")));
        }
    }

