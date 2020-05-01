package `in`.indilabz.railwire_employee.fragments

import `in`.indilabz.railwire_employee.R
import `in`.indilabz.railwire_employee.activity.UserRegistration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_user_register_one.*

class UserRegisterOne : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_user_register_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        continueBtn.setOnClickListener {
            (activity as UserRegistration).addFragment()
        }
    }

}
