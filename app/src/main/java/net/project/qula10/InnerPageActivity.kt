package net.project.qula10

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.google.gson.Gson
import com.koushikdutta.ion.Ion
import kotlinx.android.synthetic.main.activity_inner_page.*


class InnerPageActivity : AppCompatActivity() {
    var adapter: ContentAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inner_page)
        init()
    }

    private fun init() {
        val array = ArrayList<ModelArray>()
        Ion.with(this).load("GET", "https://api.exchangeratesapi.io/latest?base=USD")
            .asJsonObject()
            .setCallback{ exception, t ->
                val article = Gson().fromJson(t, Model::class.java)
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/ca.png","CAD",article.rates.CAD))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/hk.png","HKD",article.rates.HKD))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/is.png","ISK",article.rates.ISK))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/ph.png","PHP",article.rates.PHP))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/dk.png","DKK",article.rates.DKK))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/hu.png","HUF",article.rates.HUF))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/cz.png","CZK",article.rates.CZK))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/gb.png","GBP",article.rates.GBP))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/ro.png","RON",article.rates.RON))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/se.png","SEK",article.rates.SEK))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/id.png","IDR",article.rates.IDR))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/in.png","INR",article.rates.INR))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/br.png","BRL",article.rates.BRL))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/ru.png","RUB",article.rates.RUB))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/hr.png","HRK",article.rates.HRK))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/jp.png","JPY",article.rates.JPY))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/th.png","THB",article.rates.THB))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/ch.png","CHF",article.rates.CHF))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/eu.png","EUR",article.rates.EUR))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/my.png","MYR",article.rates.MYR))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/bg.png","BGN",article.rates.BGN))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/tr.png","TRY",article.rates.TRY))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/cn.png","CNY",article.rates.CNY))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/no.png","NOK",article.rates.NOK))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/nz.png","NZD",article.rates.NZD))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/za.png","ZAR",article.rates.ZAR))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/us.png","USD",article.rates.USD))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/mx.png","MXN",article.rates.MXN))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/sg.png","SGD",article.rates.SGD))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/au.png","AUD",article.rates.AUD))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/il.png","ILS",article.rates.ILS))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/kr.png","KRW",article.rates.KRW))
                array.add(ModelArray("https://www.amperordirect.com/mm5/website_v3/images/flags/pl.png","PLN",article.rates.PLN))






                Trash.layoutManager = GridLayoutManager(this,2)
                adapter = ContentAdapter(applicationContext, array)
                Trash.adapter = adapter
            }

    }
}
