package ua.example.alex.lb2_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class maingame extends AppCompatActivity {

    TextView txt;
    Button btt1, btt2, btt3, btt4, btt5, btt6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maingame);
        btt1 = (Button) findViewById(R.id.btt1);
        btt2 = (Button) findViewById(R.id.btt2);
        btt3 = (Button) findViewById(R.id.btt3);
        btt4 = (Button) findViewById(R.id.btt4);
        btt5 = (Button) findViewById(R.id.btt5);
        btt6 = (Button) findViewById(R.id.btt6);
        txt = (TextView) findViewById(R.id.txt);
        game(1);
    }
    String[] time;
    public void btt1_click(View view) {
        time = btt1.getText().toString().split("-");
        game(Integer.parseInt(time[1]));
    }
    public void btt2_click(View view) {
        time = btt2.getText().toString().split("-");
        game(Integer.valueOf(time[1]));
    }
    public void btt3_click(View view) {
        time = btt3.getText().toString().split("-");
        game(Integer.valueOf(time[1]));
    }
    public void btt4_click(View view) {
        time = btt4.getText().toString().split("-");
        game(Integer.valueOf(time[1]));
    }
    public void btt5_click(View view) {
        time = btt5.getText().toString().split("-");
        game(Integer.valueOf(time[1]));
    }
    public void btt6_click(View view) {
        time = btt6.getText().toString().split("-");
        game(Integer.valueOf(time[1]));
    }

    public void game(int a) {
    btt1.setEnabled(false); btt1.setText("");
    btt2.setEnabled(false); btt2.setText("");
    btt3.setEnabled(false); btt3.setText("");
    btt4.setEnabled(false); btt4.setText("");
    btt5.setEnabled(false); btt5.setText("");
    btt6.setEnabled(false); btt6.setText("");

        switch (a){
            case 1:
                txt.setText("Только что закончилось построение, и командир роты объявил\n" +
                        "свободное время. Да, да... И такое тоже случается. Не часто, конечно, но\n" +
                        "бывает. И теперь у вас есть несколько часов, которые можно провести по\n" +
                        "своему усмотрению. Можно сходить в чайную. В простонародии просто\n" +
                        "ЧПОК. Название ЧПОК пошло от офицеров. Так называют чайные в военных\n" +
                        "училищах и университетах. ЧПОК – это Чрезвычайная Помощь\n" +
                        "Оголодавшим Курсантам. Там всегда можно за умеренную плату\n" +
                        "перехватить стаканчик чая или лимонада, а заодно и перекусить.\n" +
                        "Или можно провести свободное время на спортгородке. Подтянуться\n" +
                        "пару раз на перекладине или отжаться на брусьях. Хотя, пожалуй, нет.\n" +
                        "Здоровым спорт ни к чему. А больным он уже не поможет.\n" +
                        "Уж лучше пойти в казарму и провести время там. Почитать подшивку\n" +
                        "«Красной звезды» или даже посмотреть телевизор, если старший призыв к\n" +
                        "нему подпустит.\n" +
                        "Хотя о чем это вы?! Время ведь идет. Нужно сосредоточиться на\n" +
                        "основных задачах. Итак, первая из них – созвониться с любимой девушкой и\n" +
                        "назначить ей встречу. И вторая – любым способом выбраться за пределы\n" +
                        "воинской части.\n");
                btt1.setEnabled(true);
                btt1.setText("Перейдите к главе -2");
                break;
            case 2:
                txt.setText("Вы стоите на плацу и смотрите по сторонам. Одна дорога уходит\n" +
                        "прямо, в сторону казармы. Другая, широкая, красивая, с побеленными\n" +
                        "бордюрами и маленькими елочками, высаженными по обеим сторонам, идет\n" +
                        "в сторону штаба. Третья дорога уходит налево, в сторону складов и\n" +
                        "автопарка. А четвертая – направо, в сторону столовой.\n" +
                        "С чего бы начать?\n");
                btt1.setEnabled(true); btt1.setText("Пойду прямо, в сторону казармы -67");
                btt2.setEnabled(true); btt2.setText("Пойду по широкой дороге в сторону штаба -3");
                btt3.setEnabled(true); btt3.setText("Пойду налево, в сторону автопарка -43");
                btt4.setEnabled(true); btt4.setText("Пойду направо, в сторону столовой -25");
                break;
            case 3:
                txt.setText("Вы идете по красивой широкой дороге. Свежие заплатки на асфальте\n" +
                        "радуют глаз. А вот елочки, высаженные вдоль, что-то не очень. Еще свежо\n" +
                        "воспоминание о том, как вы и еще несколько бойцов вашего призыва по\n" +
                        "приказу командира роты ходили в лес и там под руководством сержанта\n" +
                        "выкапывали их. А потом все это тащили на себе и снова вкапывали уже\n" +
                        "здесь, вдоль дороги, ведущей к штабу.\n" +
                        "Зато теперь эта дорога стала предметом гордости командира части. Как\n" +
                        "будто это его личная заслуга. Командир роты тогда получил благодарность\n" +
                        "от командования «за умелое руководство личным составом». Во истину «на\n" +
                        "войне умирают солдаты, а награды за них получают генералы». Хотя до\n" +
                        "генерала вашему ротному пока еще далековато. Он еще только капитан.\n" +
                        "За этими мыслями вы не заметили, как вышли на развилку. Одна\n" +
                        "дорога поворачивает налево к штабу. Другая направо к телефонному\n" +
                        "автомату. Третья идет в том же направлении и заканчивается контрольно-\n" +
                        "пропускным пунктом.\n");
                btt1.setEnabled(true); btt1.setText("Пойду по дороге, ведущей к штабу -7");
                btt2.setEnabled(true); btt2.setText("Сверну к телефонному автомату -4");
                btt3.setEnabled(true); btt3.setText("Пойду прямо к КПП -6");
                break;
                default:break;
        }


    }
}
