package `in`.indilabz.railwire_employee

import android.app.Application
import android.content.Context
import androidx.appcompat.app.AppCompatDelegate

class INDIMaster : Application(){

    var context: Context? = null


    override fun onCreate() {
        super.onCreate()
        instance = this@INDIMaster
        //CrashReporter.initialize(this)
        //ACRA.init(this);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        context = this.baseContext

    }

    companion object {

        @get:Synchronized
        var instance: INDIMaster? = null
            private set

        fun applicationContext() : INDIMaster {
            return instance!!.applicationContext as INDIMaster
        }
    }
}