package `in`.indilabz.railwire_employee.adapter

import `in`.indilabz.railwire_employee.R
import `in`.indilabz.railwire_employee.activity.ComplaintDetail
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ComplaintAdapter(var list: ArrayList<String>, var context: Context) : RecyclerView.Adapter<ComplaintAdapter.ComplaintHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComplaintHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.element_complaint,parent,false)
        return ComplaintHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ComplaintHolder, position: Int) {
        holder.heading.text = list[position]
        holder.card.setOnClickListener {
            val intent = Intent(context,ComplaintDetail::class.java)
            context.startActivity(intent)
        }
    }

    class ComplaintHolder(view: View) : RecyclerView.ViewHolder(view){
        val heading : TextView = view.findViewById(R.id.complaint_heading)
        val card : CardView = view.findViewById(R.id.complaint_layout)
    }

}