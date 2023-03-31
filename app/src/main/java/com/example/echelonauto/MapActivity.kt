package com.example.echelonauto

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.echelonauto.databinding.ActivityMapBinding
import com.mapbox.mapboxsdk.Mapbox
import com.mapbox.mapboxsdk.maps.MapView

class MapActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMapBinding

    private lateinit var mapView: MapView
    private lateinit var mapbox: Mapbox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        mapView = findViewById(R.id.mapView)
        mapView.onCreate(savedInstanceState)

        mapbox = Mapbox.getInstance(applicationContext, "sk.eyJ1IjoiYW1hZ2Vkb20iLCJhIjoiY2xleDl4d2cyMDU4dDN4bzAyOHNucWF0cCJ9.FbKr26ZQ6qDp5gxtK0QdAw")

        // Other initialization code for Mapbox
    }

    override fun onStart() {
        super.onStart()
        mapView.onStart()
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onStop() {
        super.onStop()
        mapView.onStop()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }


}