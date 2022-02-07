package net.bradball.resume

import android.app.Application
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import net.bradball.resume.testUtil.IgnoreOnRobolectric

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.experimental.categories.Category

/**
 * Instrumented test, which will execute on an Android device,
 * or with Robolectric
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@Category(IgnoreOnRobolectric::class) //This Test could run on robolectric. This is here a an example
@RunWith(AndroidJUnit4::class)
class ExampleTest {
    @Test
    fun useAppContext() {
        val app = ApplicationProvider.getApplicationContext<Application>()
        assertEquals("net.bradball.resume", app.packageName)
    }
}