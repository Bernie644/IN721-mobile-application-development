package op.mobile.dev.age.calculator

import android.app.DatePickerDialog
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var btnSelectDate: Button
    private lateinit var txtViewSelectedDate: TextView
    private lateinit var txtViewMinutesDifference: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        btnSelectDate = findViewById(R.id.btnSelectDate)
        btnSelectDate.setOnClickListener {
            showDatePicker()
        }

        txtViewSelectedDate = findViewById(R.id.txtViewSelectedDate)
        txtViewMinutesDifference = findViewById(R.id.txtViewMinutesDifference)
    }

    private fun showDatePicker() {
        val calendar = Calendar.getInstance()
        val currentTimeMillis = System.currentTimeMillis()

        val datePickerDialogListener = DatePickerDialog.OnDateSetListener { _, year, month, day ->
            val selectedDate = "$day/${month + 1}/$year"
            txtViewSelectedDate.text = getString(R.string.selected_date, selectedDate)

            val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)

            val parsedSelectedDate = simpleDateFormat.parse(selectedDate)
            val selectedDateToMinutes = parsedSelectedDate!!.time / 60000
            Log.d("MainActivity", "Selected date to minutes: $selectedDateToMinutes")

            val currentDate =
                simpleDateFormat.parse(simpleDateFormat.format(currentTimeMillis))
            val currentDateToMinutes = currentDate!!.time / 60000
            Log.d("MainActivity", "Current date to minutes: $currentDateToMinutes")

            val differenceInMinutes = currentDateToMinutes - selectedDateToMinutes
            txtViewMinutesDifference.text =
                getString(R.string.minutes_difference, differenceInMinutes.toString())
        }

        val datePickerDialog = DatePickerDialog(
            this@MainActivity,
            datePickerDialogListener,
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )

        datePickerDialog.datePicker.maxDate = currentTimeMillis
        datePickerDialog.show()
    }
}