package com.example.coffeetruckfinalproject2024

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class DisplayCoffeeTruckFragment : Fragment() {

    private var _binding: FragmentDisplayCoffeeTruckBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDisplayCoffeeTruckBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // קבלת אובייקט CoffeeTruck מה-Arguments
        val coffeeTruck = arguments?.getParcelable<CoffeeTruck>("coffeeTruck")

        coffeeTruck?.let {
            binding.textViewName.text = it.name
            binding.textViewLocation.text = it.location
            binding.textViewKosher.text = it.kosher
            binding.textViewOpeningHours.text = it.openingHours
            binding.textViewRecommendations.text = it.recommendations
            binding.textViewTripSuggestions.text = it.tripSuggestions
            binding.textViewReviews.text = it.reviews
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
