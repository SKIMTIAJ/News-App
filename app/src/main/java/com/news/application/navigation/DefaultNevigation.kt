package com.news.application.navigation

import android.app.Activity
import com.news.common_utils.Activities
import com.news.common_utils.Navigator
import com.news.news_presentation.GotoNewsActivity
import com.news.search_presentation.GotoSearchActivity

class DefaultNevigation: Navigator.Provider {
    override fun getActivity(activities: Activities): Navigator {
        return when(activities){
            Activities.NewsActivity->{
                GotoNewsActivity
            }
            Activities.SearchActivity->{
                GotoSearchActivity
            }
        }
    }


}