package com.example.coffeetruckfinalproject2024


import android.widget.*
import com.example.CoffeeTruckFinalProject2024.databinding.FragmentAddCoffeeTruckBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AddCoffeeTruckFragment : Fragment() {

    private var _binding: FragmentAddCoffeeTruckBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddCoffeeTruckBinding.inflate(inflater, container, false)
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

Step 3: Navigation (Optional)

If you are using Jetpack Navigation, ensure you have the navigation set up in your nav_graph.xml:

xml

<fragment
android:id="@+id/addCoffeeTruckFragment"
android:name="com.example.yourapp.AddCoffeeTruckFragment"
android:label="Add Coffee Truck">
<!-- Add any necessary arguments here -->
</fragment>
