package com.example.studyBuddy.presentation.di

import com.example.studyBuddy.presentation.adapter.TasksAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Named

@Module
@InstallIn(FragmentComponent::class)
object FragmentAdapterModule {
    @Provides
    @FragmentScoped
    @Named("task_category_fragment")
    fun provideTaskAdapterToTaskCategoryFragment() = TasksAdapter()
}