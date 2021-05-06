package br.com.brq.minnhaprimeiralista

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterRecyclerView(
    val context: Context,
    val nossaListaDeAnimais : ArrayList<String>
) : RecyclerView.Adapter<ViewHolderAnimais>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderAnimais {
        val inflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.item_da_nossa_lista, parent, false)
        return ViewHolderAnimais(view)
    }

    override fun onBindViewHolder(holder: ViewHolderAnimais, position: Int) {
        holder.textViewTitulo.text = "$position - ${nossaListaDeAnimais[position]}"
    }

    override fun getItemCount(): Int {
        return nossaListaDeAnimais.size
    }

}

class ViewHolderAnimais (itemView : View) : RecyclerView.ViewHolder(itemView){

    var textViewTitulo : TextView

    init {
        textViewTitulo = itemView.findViewById(R.id.textView_titulo)
    }

}