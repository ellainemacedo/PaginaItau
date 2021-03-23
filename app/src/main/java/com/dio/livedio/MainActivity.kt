package com.dio.livedio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvList: RecyclerView
    private var adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()
        setItemsLista()
    }

    private fun iniciaViews(){
        rvList = findViewById(R.id.rv_list)
        rvList.adapter = adapter
    }

    private fun setItemsLista(){
        adapter.setItemsList(
            arrayListOf(
                MenuitemModel(
                    "cartões"
                ),
                MenuitemModel(
                    "soluções"
                ),
                MenuitemModel(
                    "investimentos"
                ),
                MenuitemModel(
                    "renegociação"
                ),
                MenuitemModel(
                    "empréstimo"
                ),
                MenuitemModel(
                    "poupança"
                ),
                MenuitemModel(
                    "consórcio"

                ),MenuitemModel(
                    "câmbio"
                ),
                MenuitemModel(
                    "seguros"
                ),
                MenuitemModel(
                    "plano de previdência"
                ),
                MenuitemModel(
                    "portabilidade de salario"
                ),
                MenuitemModel(
                    "segurança"
                ),
                MenuitemModel(
                    "meus dados cadastrais"
                ),
                MenuitemModel(
                    "atendimento"
                )
            )
        )
    }
}