package com.example.newcalk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.newcalk.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    binding.txtVvod.text = ""

   binding.key1.setOnClickListener(){
       binding.txtVvod.text = binding.txtVvod.text.toString() + "1".toString()
   }
        binding.key2.setOnClickListener(){
            binding.txtVvod.text = binding.txtVvod.text.toString() + "2".toString()
        }

        binding.key3.setOnClickListener(){
            binding.txtVvod.text = binding.txtVvod.text.toString() + "3".toString()
        }
        binding.key4.setOnClickListener(){
            binding.txtVvod.text = binding.txtVvod.text.toString() + "4".toString()
        }
        binding.key5.setOnClickListener(){
            binding.txtVvod.text = binding.txtVvod.text.toString() + "5".toString()
        }
        binding.key6.setOnClickListener(){
            binding.txtVvod.text = binding.txtVvod.text.toString() + "6".toString()
        }
        binding.key7.setOnClickListener(){
            binding.txtVvod.text = binding.txtVvod.text.toString() + "7".toString()
        }
        binding.key8.setOnClickListener(){
            binding.txtVvod.text = binding.txtVvod.text.toString() + "8".toString()
        }
        binding.key9.setOnClickListener(){
            binding.txtVvod.text = binding.txtVvod.text.toString() + "9".toString()
        }
        binding.keyZer.setOnClickListener(){
            binding.txtVvod.text = binding.txtVvod.text.toString() + "0".toString()
        }
        binding.keyOpen.setOnClickListener(){
            binding.txtVvod.text = binding.txtVvod.text.toString() + "(".toString()
        }
        binding.keyClo.setOnClickListener(){
            binding.txtVvod.text = binding.txtVvod.text.toString() + ")".toString()
        }
        binding.keyMin.setOnClickListener(){
            binding.txtVvod.text = binding.txtVvod.text.toString() + "-".toString()
        }
        binding.keyMnog.setOnClickListener(){
            binding.txtVvod.text = binding.txtVvod.text.toString() + "*".toString()
        }
        binding.keyDelen.setOnClickListener(){
            binding.txtVvod.text = binding.txtVvod.text.toString() + "/".toString()
        }
        binding.keyPlus.setOnClickListener(){
            binding.txtVvod.text = binding.txtVvod.text.toString() + "+".toString()
        }
        binding.keyTck.setOnClickListener{
            binding.txtVvod.text = binding.txtVvod.text.toString() + ".".toString()
        }
        binding.keyC.setOnClickListener{
            binding.txtVvod.text = "".toString()
            binding.txtVivod.text = "0".toString()
        }


        binding.keyRav.setOnClickListener(){

            try{
                val ex = ExpressionBuilder(binding.txtVvod.text.toString()).build()
                val result = ex.evaluate()

                val longRes = result.toLong()
                if(result == longRes.toDouble()){
                    binding.txtVivod.text = longRes.toString()
                }

                else{
                    binding.txtVivod.text = result.toString()
                }
            }catch(e:Exception){
                Log.d("Ошибка", "Сообщение: ${e.message}")
            }
        }

        binding.keyCE.setOnClickListener(){randomMe()}


    }

    fun randomMe(){
        val randomIntent = Intent(this, SecondActivity::class.java)
        var countString = binding.txtVivod.text.toString()
        val count = Integer.parseInt(countString)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)
    }



}