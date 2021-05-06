package br.com.brq.minnhaprimeiralista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var meuArrayDeAnimais: ArrayList<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carregarElementos()
        carregarArray()

        recyclerView?.adapter = AdapterRecyclerView(this, meuArrayDeAnimais)
        recyclerView?.layoutManager = LinearLayoutManager(this)
    }

    fun carregarElementos(){
        recyclerView = findViewById(R.id.rv_produtos)
    }

    fun carregarArray(){
        meuArrayDeAnimais = ArrayList()
        meuArrayDeAnimais.add("Cachorro")
        meuArrayDeAnimais.add("Gato")
        meuArrayDeAnimais.add("Camelo")
        meuArrayDeAnimais.add("Cavalo")
        meuArrayDeAnimais.add("Cabra")
        meuArrayDeAnimais.add("Burro")
        meuArrayDeAnimais.add("Mula")
        meuArrayDeAnimais.add("Cobra")
        meuArrayDeAnimais.add("Pato")
        meuArrayDeAnimais.add("Galinha")
        meuArrayDeAnimais.add("Gavião")
        meuArrayDeAnimais.add("Rato")
        meuArrayDeAnimais.add("Escorpião")
        meuArrayDeAnimais.add("Barata")
        meuArrayDeAnimais.add("Pulga")

    }
}