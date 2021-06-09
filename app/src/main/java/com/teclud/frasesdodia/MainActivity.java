package com.teclud.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void geraNovafrase(View view){

                String[] frases = {"Parece que hoje em dia impera um certo senso comum entre nós de que fé e conhecimento são coisas opostas, mutuamente excludentes como luz e escuridão – se você tem conhecimento você não tem fé, e vice-versa. Há, no entanto, para contrariar essa noção, uma afirmação muito contundente na Bhagavad-Gita acerca da relação entre esses dois princípios: “shraddhavan labhate jñanam – aquele que tem fé ganha conhecimento.” De acordo com Krishna, o autor dessa afirmação, conhecimento e fé não só não são opostos como mantêm entre si uma relação muito peculiar de dependência: fé é condição sine qua non do conhecimento. Vamos entender o que isso significa.",

                "Em primeiro lugar, o que é conhecimento? Parece-me que é algo cuja força de evidência acaba com quaisquer dúvidas ou desconfianças com relação àquilo que está se mostrando com tanta clareza, e faz com que possamos",
                "permite relaxar e apenas escrever. E o que é que me concede a certeza de que de fato as palavras estão sendo escritas? São os meus olhos, com os quais tenho uma relação de plena confiança, fé.",
                "dou aos meus olhos o status de serem meios válidos de conhecimento com relação à forma e cor das coisas. E a única coisa que faz com que eu dê aos olhos esse status é a minha boa fé. Não é nenhum outro órgão de percepção",
                "endo a fé de que meus olhos são meios válidos de conhecimento eu posso interagir com o mundo razoavelmente bem. E se eu não tivesse essa fé, o que seria de mim? Há muitas pessoas no mundo com um",
                "Nesses casos, existe uma condição para o alcance do conhecimento que não está sendo cumprida, e que não tem nada ver com os meios de conhecimento envolvidos,",
                "Ao autoconhecimento, sendo apenas um tipo particular de conhecimento, se aplica a mesma necessidade: é necessária fé no meio de conhecimento que o produz. E",
                "Sem fé é possível obter a informação do que as palavras estão dizendo, e é possível até mesmo tornar-se um especialista em Vedanta que dá palestras pelo mundo todo. Mas essa pessoa falará",
                "Vedanta torna-se assim, por pura e simples falta de shraddha, apenas mais uma teoria, um sistema, e não um meio de conhecimento. Todos nós com algum tempo de"
                };
                int numero =new Random().nextInt(9);//0,1,2,3,4,5,6,7,8
                TextView texto = findViewById(R.id.valorResultado);
                texto.setText(frases[numero]);


    }
}
