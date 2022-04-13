package com.example.neuro

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.R
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var input:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input=findViewById<EditText>(R.id.display)
    }

    fun onclickoff(view: View) {
        System.exit(0);
    }
    fun onclickC(view: View) {
        var res=findViewById<TextView>(R.id.result)
        var display=findViewById<EditText>(R.id.display)
        res.setText("")
        display.setText("")
    }
    fun onclickMod(view: View) {
        var mod=findViewById<Button>(R.id.mod)
        var text=mod.getText().toString()
        input.append(text)
    }
    fun onclickOne(view: View) {
        var one=findViewById<Button>(R.id.one)
        var text=one.getText().toString()
        input.append(text)
    }
    fun onclickTwo(view: View) {
        var two=findViewById<Button>(R.id.two)
        var text=two.getText().toString()
        input.append(text)
    }
    fun onclickThree(view: View) {
        var three=findViewById<Button>(R.id.three)
        var text=three.getText().toString()
        input.append(text)
    }
    fun onclickAdd(view: View) {
        var add=findViewById<Button>(R.id.add)
        var text=add.getText().toString()
        input.append(text)
    }
    fun onclickSub(view: View) {
        var sub=findViewById<Button>(R.id.sub)
        var text=sub.getText().toString()
        input.append(text)
    }
    fun onclickFour(view: View) {
        var four=findViewById<Button>(R.id.four)
        var text=four.getText().toString()
        input.append(text)
    }
    fun onclickFive(view: View) {
        var five=findViewById<Button>(R.id.five)
        var text=five.getText().toString()
        input.append(text)
    }
    fun onclickSix(view: View) {
        var six=findViewById<Button>(R.id.six)
        var text=six.getText().toString()
        input.append(text)
    }
    fun onclickMul(view: View) {
        var mul=findViewById<Button>(R.id.mul)
        var text=mul.getText().toString()
        input.append(text)
    }
    fun onclickSeven(view: View) {
        var seven=findViewById<Button>(R.id.seven)
        var text=seven.getText().toString()
        input.append(text)
    }
    fun onclickEight(view: View) {
        var eight=findViewById<Button>(R.id.eight)
        var text=eight.getText().toString()
        input.append(text)
    }
    fun onclickNine(view: View) {
        var nine=findViewById<Button>(R.id.nine)
        var text=nine.getText().toString()
        input.append(text)
    }
    fun onclickDiv(view: View) {
        var div=findViewById<Button>(R.id.div)
        var text=div.getText().toString()
        input.append(text)
    }
    fun onclickZerozero(view: View) {
        var zero=findViewById<Button>(R.id.zerozero)
        var text=zero.getText().toString()
        input.append(text)
    }
    fun onclickZero(view: View) {
        var zero=findViewById<Button>(R.id.zero)
        var text=zero.getText().toString()
        input.append(text)
    }
    fun onclickDot(view: View) {
        var dot=findViewById<Button>(R.id.dot)
        var text=dot.getText().toString()
        input.append(text)
    }
    fun onclickEqual(view: View) {
        var txtinput = input.text.toString()
        if(txtinput.endsWith("+")||txtinput.endsWith("-")||txtinput.endsWith("/")||txtinput.endsWith("*")){
            Toast.makeText(this,"illegal expression",Toast.LENGTH_SHORT).show()
        }
        else if(txtinput.isEmpty()){
            Toast.makeText(this,"Plz provide the input",Toast.LENGTH_SHORT).show()
        }
        else {
            var result = ExpressionBuilder(txtinput).build().evaluate()
            val res = findViewById<TextView>(R.id.result)
            res.setText(result.toString())
        }
    }
}