package com.ucenm.appucenmpm01;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    // Comprueba el paquete de la aplicación; está en esta clase porque necesita ejecutarse en Android.
    @Test
    public void useAppContext() {
        // Obtiene el contexto de la aplicación que se está probando.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.ucenm.appucenmpm01", appContext.getPackageName());
    }
}