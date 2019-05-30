package com.petrlr14.mvvm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.petrlr14.mvvm.R
import com.petrlr14.mvvm.database.entities.GitHubRepo
import kotlinx.android.synthetic.main.repo_cardview.view.*

class ReposAdapter(var repos:List<GitHubRepo>): RecyclerView.Adapter<ReposAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.repo_cardview, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return repos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(repos[position])
    }

    fun updateList(newRepos:List<GitHubRepo>){
        newRepos.forEach{
            println("QUe pex")
        }
        this.repos=newRepos
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(repo: GitHubRepo) = with(itemView) {
            this.repo_name.text=repo.name
        }

    }
}