package com.news.news_presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.news.news_domain.model.Article
import com.news.news_presentation.databinding.ViewholderArticlesBinding

class NewsAdapter:RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {

    private var list = listOf<Article>()
    fun setData(list:List<Article>){
        this.list = list
        notifyItemInserted(this.list.lastIndex)
    }

    inner class MyViewHolder(val viewDataBinding:ViewholderArticlesBinding):RecyclerView.ViewHolder(viewDataBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.MyViewHolder {
        val binding = ViewholderArticlesBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsAdapter.MyViewHolder, position: Int) {
        holder.viewDataBinding.apply {
            articleHeadLine.text = list[position].title
            articleImage.loadImage(list[position].urlToImage)
            articleParagraph.text = list[position].description
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
    fun ImageView.loadImage(urlToImage: String) {
        Glide.with(this).load(urlToImage).into(this)
    }


}



