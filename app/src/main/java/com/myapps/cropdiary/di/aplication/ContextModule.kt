package com.myapps.cropdiary.di.aplication

import android.app.Activity
import android.content.Context
import androidx.fragment.app.Fragment
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(ActivityComponent::class, FragmentComponent::class)
object ContextModule {
    @Provides
    fun provideActivityContext(activity: Activity): Context {
        return activity
    }

    @Provides
    fun provideFragmentContext(fragment: Fragment): Context {
        return fragment.requireContext()
    }
}