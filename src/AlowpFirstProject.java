import javax.swing.*;
public class AlowpFirstProject{
    public static void main (String[] args){
String name;
name=JOptionPane.showInputDialog("Добрый день. Пароль?");
if(name.equals("alowp")){JOptionPane.showMessageDialog(null,"Пароль верный!");}
else{JOptionPane.showMessageDialog(null,"Пароль не верный!");}
    }
}
