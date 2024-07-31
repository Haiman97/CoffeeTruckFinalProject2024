package com.example.coffeetruckfinalproject2024


import android.widget.*
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AddaNewCoffeeTruckFragment : Fragment() {

    private var _binding: FragmentAddaNewCoffeeTruckBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddaNewCoffeeTruckBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSubmit.setOnClickListener{
            // איסוף הנתונים מהשדות
            val name = binding.editTextName.text.toString()
            val location = binding.editTextLocation.text.toString()
            val kosher = binding.editTextKosher.text.toString()
            val openingHours = binding.editTextOpeningHours.text.toString()
            val recommendations = binding.editTextRecommendations.text.toString()
            val tripSuggestions = binding.editTextTripSuggestions.text.toString()
            val reviews = binding.editTextReviews.text.toString()

            // יצירת אובייקט עגלת הקפה
            val newCoffeeTruck = CoffeeTruck(
                name = name,
                location = location,
                kosher = kosher,
                openingHours = openingHours,
                photos = null, // ניתן להוסיף תמונה כאן אם יש צורך
                recommendations = recommendations,
                tripSuggestions = tripSuggestions,
                reviews = reviews
            )
        }
    }
}


