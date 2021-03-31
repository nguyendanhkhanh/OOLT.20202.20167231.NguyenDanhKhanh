import javax.swing.JOptionPane;

public class FirstEquation {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Giai phuong trinh: ax + b = 0");

        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null, "Nhap so nguyen a: ", 
            "Input the first number", JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null, "Nhap so nguyenn b: ", 
            "Input the second number", JOptionPane.INFORMATION_MESSAGE);

        double a, b;

        a = Double.parseDouble(strNum1);
        b = Double.parseDouble(strNum2);

        if(a == 0){
            JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem");
        }
        else {
            JOptionPane.showMessageDialog(null, "Phuong trinh co mot nghiem\nx = " + -a/b);
        }

            System.exit(0);
    }
}