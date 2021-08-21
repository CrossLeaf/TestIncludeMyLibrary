package com.eton.testincludemylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eton.base_module.TestClass
import dalvik.annotation.TestTargetClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}