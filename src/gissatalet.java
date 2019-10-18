import javax.swing.*;
public class gissatalet{
    public static void main (String arg[]){
        String s = JOptionPane.showInputDialog(null, "hur många försök vill du ha?");
        int randNum =(int) (1+Math.random()*100);
        int n = Integer.parseInt(s);
        for(int i = 0;i<n;i++){
            String input = JOptionPane.showInputDialog(null, "Din gissning?");
            int guess = Integer.parseInt(input);
//Om talet är mindre
            if(guess>randNum)
                JOptionPane.showMessageDialog(null, "Talet är mindre än: " + guess);

//Om talet är större
            if(guess<randNum)
                JOptionPane.showMessageDialog(null, "Talet är större än: " + guess);

//Om du gissade rätt
            if(guess==randNum){
                JOptionPane.showMessageDialog(null, "Grattis, du gissade rätt!");
                break;
            }
        if(i == n-1)
            JOptionPane.showMessageDialog(null, "Tyvärr, rätt svar var: " + randNum);

        }

//Visar talet
        }
    }