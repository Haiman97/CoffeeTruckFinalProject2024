package com.example.coffeetruckfinalproject2024


import android.widget.*
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class AddCoffeeTruckFragment : Fragment() {

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

        binding.buttonSubmit.setOnClickListener {
            val name = binding.editTextName.text.toString()
            val location = binding.editTextLocation.text.toString()
            val kosher = when (binding.radioGroupKosher.checkedRadioButtonId) {
                R.id.radioKosher -> "Kosher"
                R.id.radioNonKosher -> "Non-Kosher"
                else -> ""
            }
            val openingHours = binding.editTextOpeningHours.text.toString()
            val recommendations = binding.editTextRecommendations.text.toString()
            val tripSuggestions = binding.editTextTripSuggestions.text.toString()
            val reviews = binding.editTextReviews.text.toString()

            // Logic to handle photo addition goes here

            if (name.isNotEmpty() && location.isNotEmpty()) {
                // Save the data (e.g., to a database or a server)
                Toast.makeText(requireContext(), "Coffee Truck added!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Please fill in all required fields.", Toast.LENGTH_SHORT).show()
            }
        }

        binding.buttonAddPhotos.setOnClickListener {
            // Logic to add photos
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


