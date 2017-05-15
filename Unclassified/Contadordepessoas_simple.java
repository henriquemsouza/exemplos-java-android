import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int numeroHomem = 0;
    int numeroMulher = 0;
    int numeroPessoas = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView campoTexto = (TextView) findViewById(R.id.textoPessoas);

        final Button botaoHomem = (Button) findViewById(R.id.botaoHomem);
        final Button botaoMulher = (Button) findViewById(R.id.botaoMulher);
        final Button botaoReset = (Button) findViewById(R.id.botaoReset);




        botaoHomem.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                numeroHomem++;
                numeroPessoas++;
                String mensagem = Integer.toString(numeroPessoas);
                campoTexto.setText("Total: " + mensagem + " pessoas");//EXIBE TOTAL DE PESSOAS
                botaoHomem.setText(Integer.toString(numeroHomem));//EXIBE TOTAL DE  HOMENS
            }
        });

        botaoMulher.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                numeroMulher++;
                numeroPessoas++;
                String mensagem = Integer.toString(numeroPessoas);
                campoTexto.setText("Total: " + mensagem + " pessoas");
                botaoMulher.setText(Integer.toString(numeroMulher));
            }
        });

        botaoReset.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                numeroMulher = 0;
                numeroHomem = 0;
                numeroPessoas = 0;
                String mensagem = Integer.toString(numeroPessoas);
                campoTexto.setText("Total: " + mensagem + " pessoas");
                botaoMulher.setText(Integer.toString(numeroMulher));
                botaoHomem.setText(Integer.toString(numeroHomem));

            }
        });


    }


}
