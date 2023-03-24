package rob.myappcompany.simplelistapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 2) View の取得と表示させるデータ（配列）を用意
        val lv: ListView = findViewById(R.id.lv)
        val data = arrayOf(
            "ライオン", "クマ", "キリン", "ゾウ", "パンダ", "コアラ", "キリン", "サル", "ヒョウ",
            "ゴリラ", "カバ", "カピバラ", "リス", "ワニ", "ハムスター", "ヒツジ", "ネコ"
        )

        // 3) adapter
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            data
        )

        // 4) adapter をlistview にセット
        lv.adapter = adapter

        // 5) クリックしてトースト表示
        lv.setOnItemClickListener { _, _, i, _ ->
            Toast.makeText(this, data[i], Toast.LENGTH_SHORT).show()
        }
    }
}
