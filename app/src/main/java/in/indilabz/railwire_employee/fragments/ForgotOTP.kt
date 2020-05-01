package `in`.indilabz.railwire_employee.fragments


import `in`.indilabz.railwire_employee.R
import `in`.indilabz.railwire_employee.activity.ForgotPassword
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_forgot_otp.*

class ForgotOTP : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forgot_otp, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        forgot_otpBack.setOnClickListener {
            (activity as ForgotPassword).backButton()
        }

        forGotSubmit.setOnClickListener {
            activity!!.finish()
        }
    }


}
