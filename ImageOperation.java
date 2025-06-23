//gui using swing
//layout using awt
//input output operations using io
//communication of system and manupilation of using through gui

import javax.swing.JButton;//gui
import javax.swing.JFileChooser;//gui
import javax.swing.JFrame;//gui
import javax.swing.JOptionPane;//gui
import javax.swing.JTextField;//gui
import java.awt.FlowLayout;//layout
import java.awt.Font;//for font
import java.io.File;//for file operation
import java.io.FileInputStream;//includes stream of inputing, takes input from user system
import java.io.FileOutputStream;//includes stream of outputing, gives output from user system
public class ImageOperation {

    public static void operate(int key)//takes key as a perameter
    {

        JFileChooser fileChooser=new JFileChooser();//object for file choosing
        fileChooser.showOpenDialog(null);//opens in centre
        File file=fileChooser.getSelectedFile();//takes file and stores in file veriable
        //file FileInputStream
        try
        {

            FileInputStream fis=new FileInputStream(file);//reads file

            byte []data=new byte[fis.available()];//array of bites, will set the size as the size of bits present file
            fis.read(data);//takes file data as a perameters
            int i=0;//declaring i
            for(byte b:data)//takes single bytes
            {
                System.out.println(b);//prints in cmd
                data[i]=(byte)(b^key);//encriptes, does exor, multiplies file goes currupt, cant access, byte converts the int data to bytes
                i++;
            }

            FileOutputStream fos=new FileOutputStream(file);//object decript
            fos.write(data);//rewrites the data and makes the file as it was before
            fos.close();//close obj
            fis.close();//close file
            JOptionPane.showMessageDialog(null, "Done");//massagebox

        }catch(Exception e)
        {
            e.printStackTrace();//throws exception
        }
    }

    public static void main(String[] args) {// main method
        
        System.out.println("Working");

        JFrame f=new JFrame();// object
        f.setTitle("Image Operation");//show name of box on top
        f.setSize(400,400);//box size
        f.setLocationRelativeTo(null);//location - centre
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//will close on close button press

        Font font=new Font("Roboto",Font.BOLD,25);//object for set font, font family, font style, size
        //creating button
        JButton button=new JButton();// object
        button.setText("Open Image");// button name
        button.setFont(font);//set font

        //creating text field

        JTextField textField=new JTextField(10); //textbox
        textField.setFont(font);//assign font

        
        button.addActionListener(e->{//listener, calls function, lemda function
            System.out.println("button clicked");//confirmation massage for cmd
            String text=textField.getText();//gets key from textbox
            int temp=Integer.parseInt(text);//converts text to int and stores in temp
            operate(temp);//operates on temp
        });

        f.setLayout(new FlowLayout());//layout

        f.add(button);//adds button
        f.add(textField);//adds textbox
        f.setVisible(true);//visibility control

    }
}